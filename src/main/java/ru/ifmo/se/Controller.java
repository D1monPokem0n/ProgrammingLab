package ru.ifmo.se;

import ru.ifmo.se.commands.*;

import java.util.HashMap;

public class Controller {
    private String consoleArgument;
    private final ProgramState programState;
    private final HashMap<String, CommandBlueprint> commandMap = CommandBlueprint.getCommandMap();

    public Controller(Storage storage) {
        programState = new ProgramState(true);
        new AddCommand("add",storage);
        new AddIfMinCommand("add_if_min",storage);
        new ClearCommand("clear",storage);
        new ExecuteScriptCommand("execute_script",storage);
        new ExitCommand("exit",programState);
        new FilterLessThanEventCommand("filter_less_than_event",storage);
        new FilterStartsWithCommentCommand("filter_starts_with_comment",storage);
        new HelpCommand("help");
        new HistoryCommand("history");
        new InfoCommand("info",storage);
        new PrintDescending("print_descending",storage);
        new RemoveByIdCommand("remove_by_id",storage);
        new RemoveLowerCommand("remove_lower",storage);
        new SaveCommand("save",storage);
        new ShowCommand("show", storage);
        new UpdateCommand("update",storage);
    }

    public CommandBlueprint getCommand(String commandName) {
        return commandMap.get(commandName);
    }

    public void executeCommand(String[] args,String commandName) {
        getCommand(commandName).execute(args);
    }

    public void setConsoleArgument(String arg) {
        consoleArgument = arg;
    }
    public String getConsoleArgument(){
        return consoleArgument;
    }

    public ProgramState getProgramState() {
        return programState;
    }
}
