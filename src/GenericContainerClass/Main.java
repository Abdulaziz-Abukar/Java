package GenericContainerClass;

/*
Exercise 3: Generic Container Class
Task:

Create a generic class Container that can hold an object and a quantity.
Implement methods getItem() and getQuantity() to return the item and quantity.
Implement a method addQuantity(int amount) to increase the quantity.
Objective:

Instantiate Container objects with different types (e.g., Container<String> and Container<Double>) and manipulate the quantity.
 */
public class Main {
    public static void main(String[] args) {
        // Instantiate a Container with a String item
        Container<String> stringContainer = new Container<>("Apples", 10);
        System.out.println("String Container: " + stringContainer);
        System.out.println("Item: " + stringContainer.getItem());
        System.out.println("Quantity: " + stringContainer.getQuantity());

        // Add to the quantity
        stringContainer.addQuantity(5);
        System.out.println("Updated String Container: " + stringContainer);

        // Instantiate a Container with a Double item
        Container<Double> doubleContainer = new Container<>(12.5, 3);
        System.out.println("\nDouble Container: " + doubleContainer);
        System.out.println("Item: " + doubleContainer.getItem());
        System.out.println("Quantity: " + doubleContainer.getQuantity());

        // Add to the quantity
        doubleContainer.addQuantity(2);
        System.out.println("Updated Double Container: " + doubleContainer);
    }
}
