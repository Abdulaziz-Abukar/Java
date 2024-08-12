package Generics;
import java.util.ArrayList;
import java.util.List;


/*
Exercise 2: Box with Maximum Capacity
Objective:
Create a generic Box class with a maximum capacity.

Requirements:

Implement a class Box<T> with the following:
A field items of type List<T> to store items.
A field capacity to limit the number of items.
A constructor that sets the capacity.
Methods addItem(T item) to add an item, and getItems() to retrieve all items.
Ensure that addItem throws an exception if the box is full.
 */

class Crate<T> {
    private List<T> items;
    private int capacity;

    Crate(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    // Add item to crate if not full.
    void addItem(T item) {
        if (items.size() >= capacity) {
            throw new IllegalStateException("Error: Capacity reached.");
        }
        items.add(item);
    }

    // Retrieve all items in the crate
    List<T> getItems() {
        return new ArrayList<>(items); // Returns a copy of the list.
    }

    // Get the capacity of the crate.
    int  getCapacity() {
        return capacity;
    }
}
public class BoxWithMaxCapacity {
    public static void main(String[] args) {
        Crate<String> crate = new Crate<>(2);
        crate.addItem("Apple");
        crate.addItem("Banana");

        try {
            crate.addItem("Orange"); // Will throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        crate.addItem("Grapes");    // This will also throw an exception.

        // Print items in the crate.
        for (String item : crate.getItems()) {
            System.out.println(item);
        }
    }
}
