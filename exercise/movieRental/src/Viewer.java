import java.util.*;

public class Viewer {
    private String name;
    List <Movie> rentedMovies = new ArrayList<>();

    Viewer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void displayRentedMovies() {
        System.out.println(name + "'s Rented Movies:");
        for (Movie movie : rentedMovies) {
            movie.printMovie();
        }
    }
}
