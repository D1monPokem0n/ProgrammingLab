package ru.ifmo.se.commands;

import ru.ifmo.se.ProgramState;

public class ExitCommand extends ConsoleCommand{
    private ProgramState programState;
    @Override
    public void execute(String[] args) {
        super.execute(args);
        programState.setWorkStatus(false);
    }
    public ExitCommand(String word, ProgramState programState){
        super(word);
        this.programState = programState;
    }
}
