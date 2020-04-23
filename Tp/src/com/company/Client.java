package com.company;


import java.util.ArrayList;


public class Client {
    private String name;
    private int phoneNumber;
    private String address;
    private ArrayList<Ticket> tickets;

    public Client(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.tickets = new ArrayList<Ticket>();
    }

    public void rentMovie(Movie movie){
        Ticket ticket = new Ticket(movie,this.name);
        if(this.tickets.size()==10){
            this.tickets.remove(0);
        }
        this.tickets.add(ticket);
    }
    public void checkTickets(){
        this.tickets.forEach((ticket)->System.out.println(ticket.toString()));
    }

    public String getName() {
        return name;
    }
}
