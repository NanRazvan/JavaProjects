package PizzaDeliveryApp;

public class PepperoniPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String size, String crustType) {
        // Additional logic for creating Pepperoni Pizza
        System.out.println("Creating Pepperoni pizza (" + size + ", " + crustType + ")...");
        return new PepperoniPizza(size, crustType);
    }
}