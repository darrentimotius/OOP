public class Chef {
    private String name; // Attribute
    private String biography;

    // Setter
    Chef(String name, String biography) { // Constructor
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
