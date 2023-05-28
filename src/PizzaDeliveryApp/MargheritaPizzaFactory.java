package PizzaDeliveryApp;

public class MargheritaPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String size, String crustType) {
        // Additional logic for creating Margherita Pizza
        System.out.println("Creating Margherita pizza (" + size + ", " + crustType + ")...");
        return new MargheritaPizza(size, crustType);
    }
}