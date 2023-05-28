package PizzaDeliveryApp;

public class MargheritaPizza implements Pizza {
    private final String size;
    private final String crustType;

    public MargheritaPizza(String size, String crustType) {
        this.size = size;
        this.crustType = crustType;
    }
    @Override
    public void prepare() {
        // Prepare Margherita pizza
        System.out.println("Preparing Margherita pizza (" + size + ", " + crustType + ")...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margherita pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margherita pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margherita pizza...");
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
