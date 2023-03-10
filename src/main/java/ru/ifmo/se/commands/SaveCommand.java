package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class SaveCommand extends StorageCommand {

    public SaveCommand(String word, Storage storage) {
        super(word, storage);
    }
}
