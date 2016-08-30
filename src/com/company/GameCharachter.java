package com.company;

public class GameCharachter {
    private char c;
    private boolean mask;

    public GameCharachter(char c) {
        this.c = c;
        mask = false;
    }

    public char getChar() {
        return c;
    }

    public boolean getMask() {
        return mask;
    }

    public void setMask(boolean mask) {
        if (((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)) {
            this.mask = mask;
        }
    }

    public boolean equals(GameCharachter gameCharachter) {
        return (c == gameCharachter.getChar() && mask == gameCharachter.getMask());
    }
}

