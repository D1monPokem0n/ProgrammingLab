package ru.ifmo.se.commands;

import java.util.HashMap;

public class CommandBlueprint implements Command {
    private String commandWord;
    private static HashMap<String, CommandBlueprint> commandMap = new HashMap<>();
    public CommandBlueprint(String commandWord){
        this.commandWord = commandWord;
        this.commandMap.put(commandWord,this);
    };

    public static void setCommandStorage(HashMap<String, CommandBlueprint> commandMap) {
        CommandBlueprint.commandMap = commandMap;
    }
    public static HashMap<String, CommandBlueprint> getCommandMap() {
        return CommandBlueprint.commandMap;
    }

    public String getCommandWord() {
        return commandWord;
    }

    public void execute(String[] args) {
        System.out.println("This command is " + getClass().getName());
    };
}
