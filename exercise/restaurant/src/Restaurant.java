import java.util.*;

public class Restaurant {
    private List <Dish> menus = new ArrayList<>();

    void addDish(Dish dish) {
        menus.add(dish);
        System.out.println("Dish added to menu: " + dish.getName());
    }

    void placeOrder(Customer customer, Dish dish) {
        menus.remove(dish);
        customer.orders.add(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getName());
    }
    
    void cancelOrder(Customer customer, Dish dish) {
        customer.orders.remove(dish);
        menus.add(dish);
        System.out.println(customer.getName() + " canceled order: " + dish.getName());
    }
    
    void displayMenu() {
        System.out.println("Menu in Restaurant:");
        for (Dish dish : menus) {
            dish.printDish();
        }
    }
}
