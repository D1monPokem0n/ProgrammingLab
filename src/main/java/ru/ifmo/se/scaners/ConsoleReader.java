package ru.ifmo.se.scaners;

import java.util.Scanner;

public class ConsoleReader {
    public String read(){
        Scanner in = new Scanner(System.in);
        String consoleString = in.nextLine();
        return consoleString.equals("") ? null : in.nextLine();
    }
}
