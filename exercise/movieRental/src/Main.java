public class Main {
    public Main() {
        Director director1 = new Director("Christopher Nolan", "Famous for mind-bending films.");
        Director director2 = new Director("Steven Spielberg", "Renowned for his blockbuster movies.");

        Movie movie1 = new Movie("Inception", "001", director1);
        Movie movie2 = new Movie("Jurassic Park", "002", director2);

        Cinema cinema = new Cinema();

        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        Viewer viewer = new Viewer("Bob");

        cinema.rentMovie(viewer, movie1);
        cinema.rentMovie(viewer, movie2);

        viewer.displayRentedMovies();

        cinema.returnMovie(viewer, movie1);

        viewer.displayRentedMovies();

        cinema.displayAvailableMovies();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
EXPECTED OUTPUT :
Movie added to cinema: Inception
Movie added to cinema: Jurassic Park
Bob rented: Inception
Bob rented: Jurassic Park
Bob's Rented Movies:
Title: Inception
ID: 001
Director: Christopher Nolan
Biography: Famous for mind-bending films.
------------------------
Title: Jurassic Park
ID: 002
Director: Steven Spielberg
Biography: Renowned for his blockbuster movies.
------------------------
Bob returned: Inception
Bob's Rented Movies:
Title: Jurassic Park
ID: 002
Director: Steven Spielberg
Biography: Renowned for his blockbuster movies.
------------------------
Movies in Cinema:
Title: Inception
ID: 001
Director: Christopher Nolan
Biography: Famous for mind-bending films.
------------------------
*/