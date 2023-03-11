package ru.ifmo.se;
import ru.ifmo.se.ticket.*;

import java.util.LinkedHashSet;

public class Storage {
    LinkedHashSet<Ticket> LHS;
    public void sort(){}
    private int elementsCount;
    public LinkedHashSet<Ticket> getLHS() {
        return LHS;
    }

    public int getElementsCount() {
        return elementsCount;
    }
    public void incElementsCount() {
        elementsCount++;
    }
    public boolean addElement(Ticket ticket){
        return LHS.add(ticket);
    }
}
