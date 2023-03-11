package ru.ifmo.se;
import ru.ifmo.se.ticket.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

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

    public List<Ticket> getSortedArray() {
        List<Ticket> sortedTicketArray = new ArrayList<>(LHS);
        Collections.sort(sortedTicketArray);
        return sortedTicketArray;
    }
}
