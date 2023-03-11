package ru.ifmo.se.commands.addcommands;

import ru.ifmo.se.commands.InvalidTicketValueException;
import ru.ifmo.se.ticket.EventType;
import ru.ifmo.se.ticket.TicketFields;
import ru.ifmo.se.ticket.TicketType;

import java.util.ArrayList;

public class AddCommandValidator {
    private TicketFields mode;

    private final ArrayList<TicketFields> validationModes;

    public AddCommandValidator() {
        validationModes = new ArrayList<>();
        validationModes.add(TicketFields.NAME);
        validationModes.add(TicketFields.COORDINATE_X);
        validationModes.add(TicketFields.COORDINATE_Y);
        validationModes.add(TicketFields.PRICE);
        validationModes.add(TicketFields.DISCOUNT);
        validationModes.add(TicketFields.COMMENT);
        validationModes.add(TicketFields.TYPE);
        //validationModes.add(TicketFields.EVENT);
        validationModes.add(TicketFields.EVENT_NAME);
        validationModes.add(TicketFields.EVENT_TICKETSCOUNT);
        validationModes.add(TicketFields.EVENT_EVENTTYPE);
    }

    public void validate(String value) throws InvalidTicketValueException {
        switch (mode) {
            case NAME, EVENT_NAME -> {
                try {
                    if (value.trim().equals("")) {
                        throw new InvalidTicketValueException("Значение этого поля не может быть null или пробелами");
                    }
                }catch (NullPointerException e){
                    throw new InvalidTicketValueException("Значение этого поля не может быть null или пробелами");
                }
            }
            case COORDINATE_X -> {
                try {
                    Integer checkedValue = Integer.valueOf(String.valueOf(value));
                    if (checkedValue <= -915 | value == null) {
                        throw new InvalidTicketValueException("Значение данного поля должно быть больше -915 и не null");
                    }
                } catch (NumberFormatException e) {
                    throw new InvalidTicketValueException("Зачем вы даёте мне String, когда я Integer?");
                }

            }
            case COORDINATE_Y -> {
                try {
                    Long.parseLong(String.valueOf(value));
                } catch (NumberFormatException e) {
                    throw new InvalidTicketValueException("Я long вообще-то(");
                }
            }
            case PRICE -> {
                try {
                    long checkedValue = Long.parseLong(String.valueOf(value));
                    if (checkedValue <= 0) {
                        throw new InvalidTicketValueException("Значение данного поля должно быть больше нуля");
                    }
                } catch (NumberFormatException e) {
                    throw new InvalidTicketValueException("Я не хочу быть String!");
                }
            }
            case DISCOUNT -> {
                try {
                    long checkedValue = Long.parseLong(String.valueOf(value));
                    if (checkedValue <= 0 | checkedValue > 100 | value == null) {
                        throw new InvalidTicketValueException("Значение данного поля не может быть null, значение поля должно быть больше 0, максимальное значение поля: 100");
                    }
                } catch (NumberFormatException e) {
                    throw new InvalidTicketValueException("Вы должны вводить число");
                }
            }
            case COMMENT -> {
                if (value == null) {
                    throw new InvalidTicketValueException("Значение этого поля не может быть null");
                }
            }
            case TYPE -> {
                try {
                    if (value == null) {
                        throw new InvalidTicketValueException("Поле не быть null");
                    }
                    TicketType.valueOf(value.toUpperCase());
                } catch (IllegalArgumentException e) {
                    throw new InvalidTicketValueException("Тут всего 3 варианта и даже в любом регистре, давайте попробуем ещё!");
                }
            }
           /* case EVENT -> {

            }*/
            case EVENT_TICKETSCOUNT -> {
                try {
                    if (value == null) {
                        throw new InvalidTicketValueException("Введите не пустую строку, пожалуйста");
                    }
                    Integer checkedValue = Integer.valueOf((value));
                    if (checkedValue <= 0) {
                        throw new InvalidTicketValueException("Введите положительное число)");
                    }
                } catch (NumberFormatException e) {
                    throw new InvalidTicketValueException("Введите обычное, целое число, пожалуйста)");
                }
            }
            case EVENT_EVENTTYPE -> {
                if (value == null) { throw new InvalidTicketValueException("Не вводите пустую строку, пожалуйста, программе грустно(");}
                try {
                    EventType.valueOf(value.toUpperCase());
                } catch (IllegalArgumentException e){
                    throw new InvalidTicketValueException("Тут 4 варианта, в любом регистре, введите верный, пожалуйста");
                }
            }
        }

    }

    public void setValidationMode(TicketFields mode) {
        this.mode = mode;
    }

    public void setDefaultValidationMode() {
        this.mode = TicketFields.NAME;
    }

    public void nextMode() {
        if (validationModes.iterator().hasNext()) {
            this.mode = validationModes.iterator().next();
        } else {
            this.mode = TicketFields.NAME;
        }
    }

    public boolean hasNextMode() {
        return validationModes.iterator().hasNext();
    }

    public String getValidationModeName() {
        return mode.getName();
    }

}
