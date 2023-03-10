package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class FilterLessThanEventCommand extends StorageCommand {
    public FilterLessThanEventCommand(String word, Storage storage) {
        super(word, storage);
    }
}
