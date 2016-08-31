package com.company;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {



        GameState game = new GameState("När lammen tystnar");
        View view = new View(game);
        view.printCodedPhrase(game.codedPhrase.toString());


        while (game.active) {
            String userInput = view.getInput(); //
            Phrase inputToExamen = new Phrase(userInput);
            int returnCode = game.examineInput(inputToExamen);
            if (returnCode == 0) {
                view.printCodedPhrase(game.codedPhrase.toString());
            } else if (returnCode == 2) {
                View.newChoice();
            }
        }
        view.endGameGraphics();
    }
}

