package com.company;

import java.util.List;

public class GameState {
    Phrase masterPhrase;
    Phrase codedPhrase;
    boolean active;

    InputParser input = new InputParser();

    public GameState(String phrase) {
        active = true;
        this.masterPhrase = new Phrase(phrase);
        codedPhrase = new Phrase(masterPhrase.toString());
        codedPhrase.maskAll();
    }

    public void validateInput(String guess) {
        String temp = PhraseManipulation.updatePhrase(guess, codedPhrase.toString(), masterPhrase.toString());
        codedPhrase = new Phrase(temp);
    }

    public int examineInput(Phrase phrase) {
        if (phrase.getPhrase().size() == 1) {
            List<Integer> positions = masterPhrase.occurenceOf(phrase);
            for (Integer position :
                    positions) {
                codedPhrase.getPhrase().get(position).setMask(false);
                return 0;
            }
            active = !masterPhrase.equals(codedPhrase);
        } else if (phrase.getPhrase().size() == masterPhrase.getPhrase().size()) {
            active = !masterPhrase.equals(phrase);
            return 0;
        }
        return 1;
    }

//    public void setMasterPhrase() {
//        System.out.println("Please enter phrase: ");
//        this.masterPhrase = input.getInputFromConsole();
//    }
}