package ru.ifmo.se.commands;

import ru.ifmo.se.ProgramState;

public class ExitCommand extends ConsoleCommand{
    private ProgramState programState;
    @Override
    public void execute() {
        super.execute();
        programState.setWorkStatus(false);
    }
    public ExitCommand(ProgramState programState){
        this.programState = programState;
    }
}
