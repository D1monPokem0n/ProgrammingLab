package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class RemoveByIdCommand extends StorageCommand {
    public RemoveByIdCommand(Storage storage) {
        super(storage);
    }
}
