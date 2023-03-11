package ru.ifmo.se.ticket;

public class Ticket implements Comparable<Ticket> {
    private Long id;
    private static Long nextId = 1L;

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
    }
    public int compareTo(Ticket other) {
        if (!creationDate.isEqual(other.creationDate)) {
            return creationDate.compareTo(other.creationDate);
        } else {
            if (!type.equals(other.type)) {
                return -type.ordinal()+other.type.ordinal();
            } else {
                if (event.compareTo(other.event) != 0) {
                    return event.compareTo(other.event);
                } else {
                    return (int)(price*discount-other.price*other.discount);
                }
            }
        }
    }

}
