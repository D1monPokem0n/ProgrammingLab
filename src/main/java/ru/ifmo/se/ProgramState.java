package ru.ifmo.se;

public class ProgramState {
    private boolean workStatus;

    public boolean isWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(boolean workStatus) {
        this.workStatus = workStatus;
    }
    public ProgramState(boolean workStatus){
        setWorkStatus(workStatus);
    }
}
