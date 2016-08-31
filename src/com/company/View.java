package com.company;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-08-30.
 */
public class View {
    InputParser input = new InputParser();
    Terminal terminal;
    GameState gameState;

    public View(GameState gameState) {
        terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        this.gameState = gameState;

        Shape panel1 = new StaticPanel(new PanelPoint(15, 5), new PanelPoint(85, 20));
        List<Shape> shapes = new ArrayList<>();
        shapes.add(panel1);
        Shape panelData = new DataPanel(new DataPoint(41, 12), new DataPoint(59, 12));
//        List<GameCharachter> temp = gameState.codedPhrase.getPhrase();
//        List<GameCharachter> activeDataPoints = panelData.draw();
//        for (int i = 0; i < temp.size(); i++) {
//
//        }


        List<Shape> dataSahpes = new ArrayList<>();
        dataSahpes.add(panelData);

        drawShapes(shapes, dataSahpes);


    }

    public void printCodedPhrase(String codedPhrase) {
        System.out.println(codedPhrase);
    }

    public String getInput() {
        return input.getInputFromConsole();
    }

    public void endGameGraphics() {
        System.out.println("Great!");
    }

    public static void newChoice() {
        System.out.println("Please choose again.");
    }

    public void drawShapes(List<Shape> shapes, List <Shape> dataShapes) {
        for (int i = 0; i < shapes.size(); i++) {
            for (Point p : shapes.get(i).draw()) {
                terminal.moveCursor(p.x, p.y);
                terminal.putCharacter(p.getData());
            }
            int j = 0;
            for (Point p : dataShapes.get(i).draw()) {
                terminal.moveCursor(p.x, p.y);
                terminal.putCharacter('M');
            }
        }
    }
}
