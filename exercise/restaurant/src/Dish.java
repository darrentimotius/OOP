public class Dish {
    private String name;
    private String id;
    private Chef chef;

    Dish(String name, String id, Chef chef) {
        this.name = name;
        this.id = id;
        this.chef = chef;
    }

    String getName() {
        return name;
    }

    String getId() {
        return id;
    }

    Chef getChef() {
        return chef;
    }

    void printDish() {
        System.out.println("Dish: " + name);
        System.out.println("ID: " + id);
        System.out.println("Chef: " + chef.getName());
        System.out.println("Biography: " + chef.getBiography());
        System.out.println("------------------------");
    }
}

/*
Dish: Beef Wellington
ID: 001
Chef: Gordon Ramsay
Biography: Expert in fine dining and Michelin-star dishes.
*/