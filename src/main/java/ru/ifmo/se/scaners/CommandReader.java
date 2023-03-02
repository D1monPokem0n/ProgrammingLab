package ru.ifmo.se.scaners;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CommandReader {
    public String read() {
        String commandsPattern = "help|info|show|add|update .*|remove_by_id .*|clear|save|execute_script .*|exit|add_if_min|remove_lower|history|filter_starts_with_comment .*|filter_less_than_event .*|print_descending";
        System.out.print("Введите команду: ");
        Scanner in = new Scanner(System.in);
        rd:
        do {
            String value = in.next();
            if (Pattern.matches(commandsPattern, value)) {
                return value;
            } else {
                System.out.print("Вы ввели неверную команду, повторите ввод: ");
                continue rd;
            }
        } while (true);
    }
}
