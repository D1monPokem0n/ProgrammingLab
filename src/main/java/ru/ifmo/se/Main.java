package ru.ifmo.se;

import com.google.gson.Gson;
import ru.ifmo.se.scaners.CommandReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Controller controller = new Controller(storage);
        CommandReader reader = new CommandReader();
        while (controller.getProgramState().isWorkStatus()) {
            String consoleString = reader.read();
            String[] commandAndArgument = consoleString.split(" ");
            String command = commandAndArgument[0];
            String argument = commandAndArgument.length == 2 ? commandAndArgument[1] : null;
            controller.setConsoleArgument(argument);
            controller.executeCommand(command);
        }
    }
}