package ru.ifmo.se.scaners;

import java.util.Scanner;


public class CommandReader {
    private final ReadValidator validator;

    public CommandReader() {
        this.validator = new ReadValidator();
    }

    public String[] read() {
        System.out.print("Введите команду: ");
        Scanner in = new Scanner(System.in);
        do {
            try {
                String value = in.nextLine();
                validator.setCheckedValue(value).validate();
                return validator.format(value);
            } catch (WrongCommandFormatException e){
                System.out.print("Неверный формат команды, повторите ввод: ");
            }
        } while (true);
    }
}
