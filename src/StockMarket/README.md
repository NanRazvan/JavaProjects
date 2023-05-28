# 📈 Stock Market Project 
This project is a simulation of a stock market system implemented in Java. It demonstrates the use of the Observer design pattern to provide real-time updates to investors or traders about the prices of specific stocks.

---

## Design Pattern: Observer
The Observer design pattern is used in this project to establish a one-to-many relationship between a subject (stock) and multiple observers (investors). The subject maintains a list of observers and notifies them automatically whenever there is a change in the stock price. The observers can then take appropriate actions based on the updated stock prices.

The Observer pattern provides a loosely coupled architecture where the subject and observers are decoupled and can vary independently. It allows for dynamic registration and unregistration of observers, enabling flexibility and extensibility in the system.

## Project Structure
The project consists of the following classes:

Observer: An interface that defines the contract for observers. It includes the update method, which is called by the subject to notify observers about changes.

Subject: An interface that defines the contract for subjects. It includes methods to register observers, unregister observers, and notify observers.

Stock: A class representing a stock. It implements the Subject interface and maintains a list of registered observers. It provides methods to set the stock price and notify observers.

Investor: A class representing an investor. It implements the Observer interface and defines the behavior for receiving updates from the stock.

StockMarketDemo: The main class that demonstrates the functionality of the stock market system. It creates a stock, registers observers, updates the stock price, and unregisters observers.

## Conclusion
The stock market project demonstrates the practical application of the Observer design pattern in a real-world scenario. By using this design pattern, the system achieves a flexible and decoupled architecture, allowing for easy scalability and extensibility. The Observer pattern is particularly useful in systems where multiple entities need to react to changes in a subject, such as stock prices, ensuring efficient communication and synchronization between the components.