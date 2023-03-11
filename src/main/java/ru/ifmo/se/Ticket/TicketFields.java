package ru.ifmo.se.ticket;

public enum TicketFields {
    NAME("name"),
    COORDINATE_X("coordinate_x"),
    COORDINATE_Y("coordinate_y"),
    PRICE("price"),
    DISCOUNT("discount"),
    COMMENT("comment"),
    TYPE("type"),
    EVENT("event"),
    EVENT_NAME("event_name"),
    EVENT_TICKETSCOUNT("event_ticketscount"),
    EVENT_EVENTTYPE("event_eventtype");
    private String name;

    public String getName() {
        return name;
    }

    TicketFields(String name) {
        this.name = name;
    }
}