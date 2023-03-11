package ru.ifmo.se.scaners;

import java.util.regex.Pattern;

public class ReadValidator {
    private String checkedValue;

    String commandsPattern = "(help|info|show|add|update|remove_by_id|clear|save|execute_script|exit|add_if_min|remove_lower|history|filter_starts_with_comment|filter_less_than_event|print_descending).*";

    public void validate() throws WrongCommandFormatException {
        boolean commandFormat = Pattern.matches(commandsPattern, checkedValue);
        boolean wordsCount = format(checkedValue).length < 3;
        if (!commandFormat | !wordsCount) {
            throw new WrongCommandFormatException();
        }
    }

    public ReadValidator setCheckedValue(String value) {
        this.checkedValue = value.trim();
        return this;
    }

    public String[] format(String value) {
        return (value.trim().split(" ").length == 1) ? new String[]{value.trim(), null} : value.trim().split(" ");
    }
}
