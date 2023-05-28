package StockMarket;

public class StockMarketDemo {
    public static void main(String[] args) {

        Stock stock1 = new Stock("AAPL", 150.0);
        Stock stock2 = new Stock("TSLA", 180.0);
        Stock stock3 = new Stock("META", 500.0);


        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Alice");
        Investor investor3 = new Investor("Clare");
        Investor investor4 = new Investor("Dima");



        stock1.registerObserver(investor1);
        stock1.registerObserver(investor2);

        stock2.registerObserver(investor1);
        stock2.registerObserver(investor3);

        stock3.registerObserver(investor1);
        stock3.registerObserver(investor4);

        stock1.setPrice(155.0);
        stock2.setPrice(1000.0);
        stock2.unregisterObserver(investor1);
        stock2.setPrice(900.0);
        stock3.setPrice(300.0);


    }
}
