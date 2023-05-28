package StockMarket;

public class Investor implements Observer<Stock> {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(Stock subject) {
        System.out.println(name + " received an update for " + subject.getSymbol() + ": $" + subject.getPrice());
    }
}


