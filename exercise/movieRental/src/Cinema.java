import java.util.*;
public class Cinema {
    private List <Movie> availableMovies = new ArrayList<>();

    // Setter
    void addMovie(Movie movie) {
        availableMovies.add(movie);
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }

    void rentMovie(Viewer viewer, Movie movie) {
        viewer.rentedMovies.add(movie);
        availableMovies.remove(movie);
        System.out.println(viewer.getName() + " rented: " + movie.getTitle());
    }

    void returnMovie(Viewer viewer, Movie movie) {
        availableMovies.add(movie);
        viewer.rentedMovies.remove(movie);
        System.out.println(viewer.getName() + " returned: " + movie.getTitle());
    }

    void displayAvailableMovies() {
        System.out.println("Movies in Cinema:");
        for (Movie movie : availableMovies) {
            movie.printMovie();
        }
    }
}
