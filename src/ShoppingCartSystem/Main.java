/*
Exercise 3: Shopping Cart System
Create a ShoppingCart class that manages a list of items.

Item Class:
Fields: itemName, price, quantity
Constructor: Initialize all fields

ShoppingCart Class:
Fields: items (an ArrayList of Item objects)
Constructor: Initialize an empty items list
Methods:
addItem(Item item): Adds an item to the cart.
removeItem(String itemName): Removes an item by its name.
listItems(): Prints the details of all items in the cart.
calculateTotal(): Calculates and returns the total cost of all items in the cart.
 */

package ShoppingCartSystem;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("PS5", 899.00, 50);
        Item item2 = new Item("XBOX", 899.00, 29);
        Item item3 = new Item("Switch", 459.00, 15);
        Item item4 = new Item("Legos", 200.00, 18);

        ShoppingCart cart1 = new ShoppingCart();

        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.addItem(item3);

        System.out.printf("Your total today will be: %.2f%n", cart1.calculateTotal());

    }
}
