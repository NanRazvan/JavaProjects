# 🍕 Pizza Delivery App

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
