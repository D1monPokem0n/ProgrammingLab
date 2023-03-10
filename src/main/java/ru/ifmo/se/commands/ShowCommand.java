package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class ShowCommand extends StorageCommand{
    public ShowCommand(String word, Storage storage) {
        super(word, storage);
    }
}
