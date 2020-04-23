package com.company;


import java.time.LocalDate;


public class Ticket {
    private Movie movie;
    private LocalDate handingDate;
    private LocalDate returnDate;
    private String clientName;

    public Ticket(Movie movie,String clientName) {
        this.movie = movie;
        this.clientName = clientName;
        this.handingDate = LocalDate.now();
        this.returnDate = handingDate.plusDays(7);
    }

    @Override
    public String toString(){
        return "Ticket:[movie="+movie.getTitle()+"/ cliente="+clientName+"/ rent date="+handingDate+"/ return date="+returnDate+"]";
    }

}
