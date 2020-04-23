package com.company;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Client pedro = new Client("Pedro",15642134,"Mi casa");
        Client juan = new Client("Juan",15431561,"La casa de Juan");
        Movie pelicula = new Movie("Lo que el viento se llevo","19 de Marzo",135,
                "ARG","una peli piola",12,2,4);
        Movie pelicula2 = new Movie("Bananas en pijamas","15 de 194",124,
                "BRA", "malarda",5,4,2);
        app.addClient(pedro);
        app.addClient(juan);
        app.addMovie(pelicula);
        app.addMovie(pelicula2);
        app.rentMovie(pedro,"Lo que el viento se llevo");
        app.rentMovie(juan,"Lo que el viento se llevo");
        app.rentMovie(pedro,"Bananas en pijamas");
        app.rentMovie(juan,"Bananas en pijamas");
        app.rentMovie(pedro,"Bananas en pijamas");
        app.checkActiveRents();
        app.checkClientActiveRents(pedro);
        app.showMovies();
        app.printMoviesByGenre("COMEDIA");
        app.showSpecificMovie("Lo que el viento se llevo");

    }
}
