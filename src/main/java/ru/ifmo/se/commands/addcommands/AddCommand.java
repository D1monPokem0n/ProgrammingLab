package ru.ifmo.se.commands.addcommands;

import ru.ifmo.se.Storage;
import ru.ifmo.se.commands.InvalidTicketValueException;
import ru.ifmo.se.commands.StorageCommand;
import ru.ifmo.se.scaners.ConsoleReader;
import ru.ifmo.se.ticket.*;

import java.util.HashMap;

public class AddCommand extends StorageCommand {
    AddCommandValidator validator;

    public AddCommand(Storage storage) {
        super(storage);
        AddCommandValidator validator = new AddCommandValidator();
        validator.setDefaultValidationMode();
    }

    @Override
    public void execute() {
        super.execute();
        HashMap<String, String> ticketValues = new HashMap<>();
        ConsoleReader reader = new ConsoleReader();
        validreading:
        for (validator.setDefaultValidationMode(); validator.hasNextMode(); validator.nextMode()) {
            while (true) {
                try {
                    String value = reader.read();
                    validator.validate(value);
                    ticketValues.put(validator.getValidationModeName(), value);
                    continue validreading;
                } catch (InvalidTicketValueException e) {
                    System.out.print("Повторите ввод: ");
                }
            }
        }
        Coordinates coordinates = new Coordinates(Integer.valueOf(ticketValues.get("coordinate_x")), Long.parseLong(ticketValues.get("coordinate_y")));
        Event event = new Event(ticketValues.get("event_name"), Integer.valueOf(ticketValues.get("event_ticketscount")), EventType.valueOf(ticketValues.get("event_eventtype")));
        Ticket ticket = new Ticket(ticketValues.get("name"), coordinates, Long.parseLong(ticketValues.get("price")), Long.parseLong(ticketValues.get("discount")), ticketValues.get("comment"), TicketType.valueOf(ticketValues.get("type")), event);
        if (getStorage().addElement(ticket)) {
            System.out.println("Вы успешно добавили элемент!");
        } else {
            System.out.println("Данный элемент уже содержится в коллекции");
        }
    }
}

