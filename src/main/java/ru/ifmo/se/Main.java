package ru.ifmo.se;

import ru.ifmo.se.scaners.CommandReader;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Controller controller = new Controller(storage);
        System.out.println("help : вывести справку по доступным командам\ninfo : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\nshow : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\nadd {element} : добавить новый элемент в коллекцию\nupdate id {element} : обновить значение элемента коллекции, id которого равен заданному\nremove_by_id id : удалить элемент из коллекции по его id\nclear : очистить коллекцию\nsave : сохранить коллекцию в файл\nexecute_script file_name : считать и исполнить скрипт из указанного файла.\nexit : завершить программу (без сохранения в файл)\nadd_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции\nremove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\nhistory : вывести последние 5 команд (без их аргументов)\nfilter_starts_with_comment comment : вывести элементы, значение поля comment которых начинается с заданной подстроки\nfilter_less_than_event event : вывести элементы, значение поля event которых меньше заданного\nprint_descending : вывести элементы коллекции в порядке убывания");
        CommandReader reader = new CommandReader();
        while (controller.getProgramState().isWorkStatus()) {
            String[] consoleString = reader.read();
            String command = consoleString[0];
            String argument = consoleString[1];
            controller.setConsoleArgument(argument);
            controller.executeCommand(command);
        }
    }
}