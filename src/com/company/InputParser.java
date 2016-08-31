package com.company;

import java.util.Scanner;

public class InputParser {
    Scanner sc = new Scanner(System.in);

    public String getInputFromConsole(){

        String s = sc.nextLine();
        return s;
    }

    public static String getInputFromFile(){
        return null;
    }
}