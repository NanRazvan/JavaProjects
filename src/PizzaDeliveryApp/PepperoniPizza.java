package PizzaDeliveryApp;

public class PepperoniPizza implements Pizza {
    private final String size;
    private final String crustType;

    public PepperoniPizza(String size, String crustType) {
        this.size = size;
        this.crustType = crustType;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni pizza (" + size + ", " + crustType + ")...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni pizza...");
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getCrustType() {
        return crustType;
    }
}
