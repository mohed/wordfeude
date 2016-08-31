package com.company;

public class PhraseManipulation {

    public static String encode(String phrase) {
        String s = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                s += " ";
            } else {
                s += "*";
            }
        }
        return s;
    }

    public static String updatePhrase(String input, String codedPhrase, String masterPhrase) {
        String s = "";
        if (input.equalsIgnoreCase(masterPhrase)) {
            return masterPhrase;
        }
        for (int i = 0; i < masterPhrase.length(); i++) {
            if (codedPhrase.charAt(i) != '*') {
                s += codedPhrase.charAt(i);
            } else if (masterPhrase.toLowerCase().charAt(i) == input.toLowerCase().charAt(0)) {
                s += masterPhrase.charAt(i);
            } else {
                s += "*";
            }
        }
        return  s;
    }
}
