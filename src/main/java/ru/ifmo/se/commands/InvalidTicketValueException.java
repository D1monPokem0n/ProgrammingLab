package ru.ifmo.se.commands;

public class InvalidTicketValueException extends Exception{
    public InvalidTicketValueException(){}
    public InvalidTicketValueException(String comment){
        System.out.println(comment);
    }
}
