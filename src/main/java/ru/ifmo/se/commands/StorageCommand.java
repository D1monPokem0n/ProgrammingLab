package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class StorageCommand extends CommandBlueprint {
    private final Storage storage;

    public Storage getStorage() {
        return storage;
    }
    public StorageCommand(String word, Storage storage){
        super(word);
        this.storage = storage;
    }
}
