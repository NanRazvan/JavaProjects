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


----------------------
# 🍕 Pizza Delivery App Project

The Pizza Delivery App is a command-line application that allows users to order pizzas for delivery.


## Design Pattern Used

The Pizza Delivery App utilizes the Factory Method design pattern to create pizzas dynamically based on user input. The PizzaFactory abstract class acts as the factory, and concrete subclasses (such as MargheritaPizzaFactory and PepperoniPizzaFactory) implement the createPizza() method to create specific types of pizzas. This design pattern promotes code flexibility, extensibility, and encapsulation by allowing the addition of new pizza types without modifying the existing code.

## Features

- Choose from a variety of pizza types: Margherita, Pepperoni, etc. :D
- Order customization options: size, toppings, crust type, etc.
- Delivery tracking: updates on delivery status and estimated arrival time.
- User-friendly interface with interactive menu.

## Usage

1. Select a pizza type from the menu options.
2. Customize your pizza by choosing the desired size and crust type.
3. Confirm your order.
4. Enjoy your delicious pizza!

## Conclusion
In conclusion, the Pizza Delivery App is a Java-based application that utilizes the Factory Method design pattern to create customizable pizzas based on user preferences. By incorporating the design pattern, the app achieves flexibility, extensibility, and separation of concerns. It allows users to select pizza types, customize size and crust type, and place delivery orders. The project demonstrates the practical application of design patterns in solving real-life problems and enhancing software maintainability and scalability. It serves as a foundation for future enhancements and inspires further exploration of design patterns in software development.
