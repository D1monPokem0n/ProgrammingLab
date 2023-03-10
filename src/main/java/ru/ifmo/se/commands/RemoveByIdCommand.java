package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class RemoveByIdCommand extends StorageCommand {
    public RemoveByIdCommand(String word, Storage storage) {
        super(word, storage);
    }
}
