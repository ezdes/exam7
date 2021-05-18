package com.example.demo.Model;

import lombok.Data;

@Data
public class Ticket implements AbstractSomething{

    private String paymentMethod;
    private String name;
    private String site;

    private static Ticket ticket;

    private Ticket(){
        paymentMethod = "cash";
        name = "ticket";
        site = "ticket.com";
    }

    public static Ticket getInstance(){
        if(ticket == null){
            ticket = new Ticket();
        }
        return ticket;
    }
}
