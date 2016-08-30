package com.company;

import java.util.ArrayList;
import java.util.List;

public class Phrase {
    public List<GameCharachter> phrase;

    public Phrase(String phrase) {
        this.phrase = new ArrayList<>();
        for (int i = 0; i < phrase.length(); i++) {
            GameCharachter gc = new GameCharachter(phrase.charAt(i));
            this.phrase.add(gc);
        }
    }

    public List<GameCharachter> getPhrase() {
        return phrase;
    }

    public void maskAll() {
        for (GameCharachter gameCharachter :
                phrase) {
            gameCharachter.setMask(true);
        }
    }

    public List<Integer> occurenceOf(Phrase phrase) {
        List<Integer> occurrence = new ArrayList<>();
        GameCharachter gc = phrase.getPhrase().get(0);

        for (int i = 0; i < this.phrase.size(); i++) {
            if (this.phrase.get(i).equals(gc)) {
                occurrence.add(i);
            }
        }
        return occurrence;
    }

    public boolean equals(Phrase toCheck) {
        List<GameCharachter> listofcharacters = toCheck.getPhrase();

        if (phrase.size() != listofcharacters.size()) {
            return false;
        }

        for (int i = 0; i < listofcharacters.size(); i++) {
            if (!phrase.get(i).equals(listofcharacters.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String s = "";
        for (GameCharachter gc :
                phrase) {
            if (gc.getMask() == true) {
                s += '*';
            } else {
                s += gc.getChar();
            }
        }
        return s;
    }
}
