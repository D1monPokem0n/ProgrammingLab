package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public abstract class StorageCommand implements Command{
    private final Storage storage;

    @Override
    public void execute() {
        System.out.println("This Command is " + this.getClass().getName());
    }

    public Storage getStorage() {
        return storage;
    }
    public StorageCommand(Storage storage){
        this.storage = storage;
    }
}
