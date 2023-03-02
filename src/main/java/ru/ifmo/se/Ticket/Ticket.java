package ru.ifmo.se.Ticket;

public class Ticket {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDate creationDate;
    private long price;
    private Long discount;
    private String comment;
    private TicketType type;
    private Event event;
}
