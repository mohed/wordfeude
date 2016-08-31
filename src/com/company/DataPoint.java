package com.company;

public class DataPoint extends Point {
    public GameCharachter gc;

    public DataPoint(int x, int y) {
        super.x = x;
        super.y = y;
//        this.gc = gc;
    }

    @Override
    public char getData(){
        if (gc.getMask() == true){
            return 'X';
        } else {
            return gc.getChar();
        }
    }
}
