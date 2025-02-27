public class Movie {
    private String title;
    private String id;
    private Director director;

    // Setter
    Movie(String title, String id, Director director) {
        this.title = title;
        this.id = id;
        this.director = director;
    }

    // Getter
    String getTitle() {
        return title;
    }

    String getId() {
        return id;
    }

    Director getDirector() {
        return director;
    }

    void printMovie() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Director: " + director.getName());
        System.out.println("Biography: " + director.getBiography());
    }

    /*
    Title: Inception
    ID: 001
    Director: Christopher Nolan
    Biography: Famous for mind-bending films.
     */
}
