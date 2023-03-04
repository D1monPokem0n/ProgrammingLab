package ru.ifmo.se;

import ru.ifmo.se.commands.*;

import java.util.HashMap;

public class Controller {
    private String consoleArgument;
    private final ProgramState programState;
    private final HashMap<String, Command> commandMap = new HashMap<>();

    public Controller(Storage storage) {
        programState = new ProgramState(true);
        commandMap.put("add", new AddCommand(storage));
        commandMap.put("add_if_min", new AddIfMinCommand(storage));
        commandMap.put("clear", new ClearCommand(storage));
        commandMap.put("execute_script", new ExecuteScriptCommand(storage));
        commandMap.put("exit", new ExitCommand(programState));
        commandMap.put("filter_less_than_event", new FilterLessThanEventCommand(storage));
        commandMap.put("filter_starts_with_comment", new FilterStartsWithCommentCommand(storage));
        commandMap.put("help", new HelpCommand());
        commandMap.put("history", new HistoryCommand());
        commandMap.put("info", new InfoCommand(storage));
        commandMap.put("print_descending", new PrintDescending(storage));
        commandMap.put("remove_by_id", new RemoveByIdCommand(storage));
        commandMap.put("remove_lower", new RemoveLowerCommand(storage));
        commandMap.put("save", new SaveCommand(storage));
        commandMap.put("show", new ShowCommand(storage));
        commandMap.put("update", new UpdateCommand(storage));
    }

    public Command getCommand(String commandName) {
        return commandMap.get(commandName);
    }

    public void executeCommand(String commandName) {
        getCommand(commandName).execute();
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
