package PizzaDeliveryApp;

import java.util.Scanner;

public class PizzaDeliveryApp {
    private static void processPizza(Pizza pizza) {

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        System.out.println("Ready For Delivery");


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PizzaFactory pizzaFactory;
        Pizza pizza;
        String size;
        String crustType;

        while (true) {

            // Display menu options
            System.out.println("Select a pizza type:");
            System.out.println("1. Margherita");
            System.out.println("2. Pepperoni");
            System.out.println("3. Place Order");
            System.out.println("0. Exit");

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Process user choice
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the size of the Margherita pizza (small, medium, large ) : ");
                    size = scanner.nextLine();
                    System.out.print("Enter the crust type of the Margherita pizza (thin, thick, cheese) : ");
                    crustType = scanner.nextLine();

                    pizzaFactory = new MargheritaPizzaFactory();
                    pizza = pizzaFactory.createPizza(size,crustType);
                    processPizza(pizza);
                }
                case 2 -> {
                    System.out.print("Enter the size of the Pepperoni pizza ( [0] small, [1] medium, [2] big ) : ");
                    size = scanner.nextLine();
                    System.out.print("Enter the crust type of the Pepperoni pizza (thin, thick, cheese) : ");
                    crustType = scanner.nextLine();

                    pizzaFactory = new PepperoniPizzaFactory();
                    pizza = pizzaFactory.createPizza(size,crustType);
                    processPizza(pizza);
                }
                case 3 -> {
                    System.out.println("Your pizza order is out for delivery !");
                    System.exit(0);
                }
                case 0 -> {
                    System.out.println("Exiting the pizza delivery app...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

    }

}