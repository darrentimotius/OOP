public class Director {
    private String name;
    private String biography;

    // Setter
    Director(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    // Getter
    String getName() {
        return name;
    }

    String getBiography() {
        return biography;
    }
}
