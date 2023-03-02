package ru.ifmo.se.Ticket;

public class Ticket {
    private Long id;
    private static Long nextId = new Long(1);

    private String name;
    private Coordinates coordinates;
    private java.time.LocalDate creationDate;
    private long price;
    private Long discount;
    private String comment;
    private TicketType type;
    private Event event;


    public Ticket(String name, Coordinates coordinates, long price, Long discount, String comment, TicketType type, Event event) {
        id = nextId;
        nextId++;

        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = java.time.LocalDate.now();
        this.price = price;
        this.discount = discount;
        this.comment = comment;
        this.type = type;
        this.event = event;
        System.out.println(creationDate);
    }
}
