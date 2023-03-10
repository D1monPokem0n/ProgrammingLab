package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class ExecuteScriptCommand extends StorageCommand{
    public ExecuteScriptCommand(String word, Storage storage) {
        super(word, storage);
    }
}
