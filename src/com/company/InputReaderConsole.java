package com.company;

import java.util.Scanner;

public class InputReaderConsole implements inputReader {

    Scanner sc = new Scanner(System.in);

    @Override
    public String getInput(){

        String s = sc.nextLine();
        return s;
    }
}
