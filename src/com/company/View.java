package com.company;

/**
 * Created by Administrator on 2016-08-30.
 */
public class View {
    InputParser input = new InputParser();

    public void printCodedPhrase(String codedPhrase) {
        System.out.println(codedPhrase);
    }

    public String getInput() {
        return input.getInputFromConsole();
    }

    public void endGameGraphics(){
        System.out.println("Great!");
    }

    public static void newChoice() {
        System.out.println("Please choose again.");
    }
}
