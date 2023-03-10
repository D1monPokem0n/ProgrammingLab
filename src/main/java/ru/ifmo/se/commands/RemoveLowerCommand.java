package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class RemoveLowerCommand extends StorageCommand {
    public RemoveLowerCommand(String word, Storage storage) {
        super(word, storage);
    }
}
