import java.util.*;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Name Chef 1 : ");
        String nameChef1 = scanner.nextLine();
        
        System.out.print("Input Biography Chef 1 : ");
        String biography1 = scanner.nextLine();
        Chef chef1 = new Chef(nameChef1, biography1);
        
        System.out.print("Input Name Chef 2 : ");
        String nameChef2 = scanner.nextLine();
        
        System.out.print("Input Biography Chef 2 : ");
        String biography2 = scanner.nextLine();
        Chef chef2 = new Chef(nameChef2, biography2);

        System.out.print("Input Dish name 1 : ");
        String nameDish1 = scanner.nextLine();
        
        System.out.print("Input Dish ID 1 : ");
        String id1 = scanner.nextLine();
        Dish dish1 = new Dish(nameDish1, id1, chef1);
        
        
        System.out.print("Input Dish name 2 : ");
        String nameDish2 = scanner.nextLine();
    
        System.out.print("Input Dish ID 2 : ");
        String id2 = scanner.nextLine();
        Dish dish2 = new Dish(nameDish2, id2, chef2);

        Restaurant restaurant = new Restaurant();

        restaurant.addDish(dish1);
        restaurant.addDish(dish2);

        System.out.print("Input Customer Name : ");
        String nameCustomer = scanner.nextLine();
        Customer customer = new Customer(nameCustomer);

        restaurant.placeOrder(customer, dish1);
        restaurant.placeOrder(customer, dish2);

        customer.displayOrders();

        restaurant.cancelOrder(customer, dish1);

        customer.displayOrders();

        restaurant.displayMenu();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
EXPECTED OUTPUT:
Dish added to menu: Beef Wellington
Dish added to menu: Pasta Carbonara
John ordered: Beef Wellington
John ordered: Pasta Carbonara
John's Orders:
Dish: Beef Wellington
ID: 001
Chef: Gordon Ramsay
Biography: Expert in fine dining and Michelin-star dishes.
------------------------
Dish: Pasta Carbonara
ID: 002
Chef: Jamie Oliver
Biography: Famous for healthy and simple recipes.
------------------------
John canceled order: Beef Wellington
John's Orders:
Dish: Pasta Carbonara
ID: 002
Chef: Jamie Oliver
Biography: Famous for healthy and simple recipes.
------------------------
Menu in Restaurant:
Dish: Beef Wellington
ID: 001
Chef: Gordon Ramsay
Biography: Expert in fine dining and Michelin-star dishes.
------------------------
*/