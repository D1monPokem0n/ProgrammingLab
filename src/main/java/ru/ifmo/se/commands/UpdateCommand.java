package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class UpdateCommand extends StorageCommand {
    public UpdateCommand(String word, Storage storage) {
        super(word, storage);
    }
}
