package ru.ifmo.se;

import com.google.gson.Gson;
import ru.ifmo.se.scaners.CommandReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandReader rd = new CommandReader();
        String command = rd.read();
        System.out.println(command);
    }
}