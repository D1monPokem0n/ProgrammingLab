package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class AddCommand extends StorageCommand{
    public AddCommand(String word, Storage storage) {
        super(word, storage);
    }
}
