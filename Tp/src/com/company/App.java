package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    private ArrayList<Client> clients;
    private ArrayList<Movie> movies;

    public App(){
        this.clients = new ArrayList<Client>();
        this.movies = new ArrayList<Movie>();
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void checkActiveRents(){
        this.clients.forEach((Client)->Client.checkTickets());
    }

    public Movie getMovieByTitle(String movieTitle){
        int i = 0;
        while((movieTitle != this.movies.get(i).getTitle()) || (i>this.movies.size()) ){
            i++;
        }
        return this.movies.get(i);
    }

    public void printMoviesByGenre(String genre){
        System.out.println("PELICULAS POR GENERO:"+genre);
        for (Movie movie : movies){
            if(movie.getGenre()==genre){
                System.out.println(movie.toString());
            }
        }
        System.out.println("FIN PELICULAS POR GENERO:"+genre);
    }

    //Siempre que se alquila una peli se ordenan todas con respecto a las veces que fueron alquiladas.
    public void rentMovie(Client client,String movieTitle){
        int i = this.clients.indexOf(client);
        Client aux = this.clients.get(i);
        Movie aux2 = getMovieByTitle(movieTitle);
        aux.rentMovie(aux2);
        aux2.rentMovie();
        this.movies = getSortedByTimesRented();
    }

    public void checkClientActiveRents(Client client){
        int i = this.clients.indexOf(client);
        Client aux = this.clients.get(i);
        System.out.println("ALQUILERES DE "+aux.getName());
        aux.checkTickets();
        System.out.println("FIN ALQUILERES "+aux.getName());
    }

    public ArrayList<Movie> getSortedByTimesRented(){
        Collections.sort(movies);
        return movies;
    }

    public void showMovies(){
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public void showSpecificMovie(String movieTitle){
        Movie aux = getMovieByTitle(movieTitle);
        aux.showDetails();
    }

}
