import java.util.*;;

public class Customer {
    private String name; // Attribute
    List <Dish> orders = new ArrayList<>();

    Customer(String name) { // Constructor
        this.name = name; // Setter
    }

    String getName() {
        return name; // Getter
    }

    void displayOrders() {
        System.out.println(name + "'s Orders:");
        for (Dish dish : orders) {
            dish.printDish();
        }
    }
}
