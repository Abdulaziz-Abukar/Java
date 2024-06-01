package OOPCars; // Declares the package for organizing related classes

public class Car {
    // Fields (attributes) of the Car class
    String make = "Chevrolet"; // The make of the car
    String model = "Corvette"; // The model of the car
    int year = 2020; // The year of manufacture
    String color = "Blue"; // The color of the car
    double price = 50000.00; // The price of the car

    // Method to simulate driving the car
    void drive() {
        System.out.println("You drive the car"); // Prints a message when the car is driven
    }

    // Method to simulate braking the car
    void brake() {
        System.out.println("You step on the brakes"); // Prints a message when the brakes are applied
    }
}
