package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class ClearCommand extends StorageCommand{
    public ClearCommand(String word, Storage storage) {
        super(word, storage);
    }
}
