package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class AddIfMinCommand extends StorageCommand {
    public AddIfMinCommand(String word, Storage storage) {
        super(word, storage);
    }
}
