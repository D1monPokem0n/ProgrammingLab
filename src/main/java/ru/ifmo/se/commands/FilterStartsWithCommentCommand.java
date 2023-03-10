package ru.ifmo.se.commands;

import ru.ifmo.se.Storage;

public class FilterStartsWithCommentCommand extends StorageCommand {
    public FilterStartsWithCommentCommand(String word, Storage storage) {
        super(word, storage);
    }
}
