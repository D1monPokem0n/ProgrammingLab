package ru.ifmo.se.ticket;

public enum TicketType {
    VIP("VIP"),
    USUAL("USUAL"),
    CHEAP("CHEAP");
    private final String name;
    TicketType(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
