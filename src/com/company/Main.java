package com.company;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        GameState game = new GameState("Matrix");
        view.printCodedPhrase(game.codedPhrase.toString());


        while (game.active) {
            String userInput = view.getInput(); //
            Phrase inputToExamen = new Phrase(userInput);
            int returnCode = game.examineInput(inputToExamen);
            if (returnCode == 0) {
                view.printCodedPhrase(game.codedPhrase.toString());
            } else if (returnCode == 1) {
                View.newChoice();
            }
        }

        view.endGameGraphics();
//        String s = "hello world";
//        String t = "hello world";
//        Phrase master = new Phrase(s);
//        Phrase slave = new Phrase(t);
//
//        System.out.println(master.toString());
//        System.out.println(slave.toString());
//        System.out.println(master.equals(slave));
//        slave.maskAll();
//        System.out.println(slave);
//        System.out.println((int) 'h');
    }
}

