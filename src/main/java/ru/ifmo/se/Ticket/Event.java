package ru.ifmo.se.ticket;

public class Event {
    private int id;
    private static int nextId = 1;
    private String name;
    private Integer ticketCount;
    private EventType eventType;

    public Event(String name, Integer ticketCount, EventType eventType) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.ticketCount = ticketCount;
        this.eventType = eventType;
    }
}
