package com.company;

public class Movie implements Comparable<Movie>{
    private String title;
    private String launchDate;
    private int duration;
    private String origenCountry;
    private String movieDescription;
    private String audience;
    private String genre;
    private int movieCopies;
    private int timesRented;

    protected Movie(String title, String launchDate, int duration, String origenCountry, String movieDescription, int movieCopies, int genre, int audience) {
        this.title = title;
        this.launchDate = launchDate;
        this.duration = duration;
        this.origenCountry = origenCountry;
        this.movieDescription = movieDescription;
        this.movieCopies = movieCopies;
        this.timesRented = 0;
        setAudience(audience);
        setGenre(genre);
    }


    public void setAudience(int audience) {
        switch(audience){
            case 1:
                this.audience = "G";
                break;
            case 2:
                this.audience = "PG";
                break;
            case 3:
                this.audience = "PG-13";
                break;
            case 4:
                this.audience = "R";
                break;
            case 5:
                this.audience = "NC-17";
                break;
            case 6:
                this.audience = "UNRATED";
                break;
            default:
                System.out.println("Wrong audience rate...");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        switch(genre){
            case 1:
                this.genre = "ACCION";
                break;
            case 2:
                this.genre = "AVENTURA";
                break;
            case 3:
                this.genre = "DRAMA";
                break;
            case 4:
                this.genre = "COMEDIA";
                break;
            case 5:
                this.genre = "HORROR";
                break;
            case 6:
                this.genre = "DOCUMENTAL";
                break;
            default:
                System.out.println("Wrong genre...");
        }
    }

    public void rentMovie(){
        this.movieCopies--;
        this.timesRented++;
    }
    public void returnMovie(){
        this.movieCopies++;
    }

    public String getTitle() {
        return title;
    }

    public int getTimesRented() {
        return timesRented;
    }

    @Override
    public int compareTo(Movie o) {
        return (this.getTimesRented() > o.getTimesRented() ? -1 :
                (this.getTimesRented() == o.getTimesRented() ? 0 : 1));
    }

    @Override
    public String toString(){
        return "[Movie:"+title+" /times rented="+timesRented+"]";
    }

    public void showDetails(){
        System.out.println("[TITULO:"+title+" Detalles:"+movieDescription+"  y bla bla bla me da fiaca hacerlo con todo xd");
    }
}