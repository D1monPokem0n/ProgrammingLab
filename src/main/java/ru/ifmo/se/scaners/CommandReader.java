package ru.ifmo.se.scaners;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CommandReader {
    public String read() {
        String commandsPattern = "(help|info|show|add|update|remove_by_id|clear|save|execute_script|exit|add_if_min|remove_lower|history|filter_starts_with_comment|filter_less_than_event|print_descending).*";
        System.out.print("Введите команду: ");
        Scanner in = new Scanner(System.in);
        do {
            String value = in.nextLine().trim();
            boolean correctWordsNumber = (value.split(" ").length < 3);
            boolean correctCommand = Pattern.matches(commandsPattern, value);
            if (correctCommand & correctWordsNumber) {
                return value;
            } else if (correctCommand & !correctWordsNumber) {
                System.out.print("Вы ввели слишком много аргументов или пробелов, повторите ввод: ");
            } else {
                System.out.print("Вы ввели неверную команду, повторите ввод: ");
            }
        } while (true);
    }
}
