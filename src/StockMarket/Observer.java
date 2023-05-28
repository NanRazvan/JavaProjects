package StockMarket;

public interface Observer<T> {
    void update(T subject);
}
