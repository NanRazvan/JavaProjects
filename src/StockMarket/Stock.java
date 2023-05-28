package StockMarket;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject<Stock> {
    private final String symbol;
    private double price;
    private final List<Observer<Stock>> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void registerObserver(Observer<Stock> observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer<Stock> observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer<Stock> observer : observers) {
            observer.update(this);
        }
    }
}
