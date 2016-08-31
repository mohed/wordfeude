package com.company;

public class PanelPoint extends Point {
    public  char deco = 'X';

    public PanelPoint(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public char getData() {
        return deco;
    }

}
