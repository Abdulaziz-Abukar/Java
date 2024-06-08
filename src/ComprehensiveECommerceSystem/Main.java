/*
3. E-commerce System
Exercise:
Design an e-commerce system with the following features:

Classes and Objects:

Create a superclass Product with properties name and price, and an abstract method displayDetails().
Create subclasses Electronics, Clothing, and Food that extend Product and implement the displayDetails() method.
Add unique properties to each subclass, such as warrantyPeriod for Electronics, size for Clothing, and expiryDate for Food.
Control Flow and Loops:

Create a ShoppingCart class that maintains a list of Product objects.
Implement methods to add products to the cart, display all products in the cart, and calculate the total cost of the cart.
Polymorphism:

Use polymorphism to handle different types of Product objects in the ShoppingCart class.
Objective:

Instantiate objects of Electronics, Clothing, and Food, add them to the ShoppingCart, and demonstrate all functionalities.
 */

package ComprehensiveECommerceSystem;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("PS5", 899, 90);
        Clothing clothing = new Clothing("Shirt", 45.10, "L");
        Food food = new Food("Apples", 5.50, "08/10/24");

        ShoppingCart shoppingCart = new ShoppingCart();
//
//        shoppingCart.addProducts(electronics);
//        shoppingCart.addProducts(clothing);
//        shoppingCart.addProducts(food);
//
//        shoppingCart.displayProducts();

        System.out.printf("Total today is: $%.2f%n", shoppingCart.calculateTotal());
    }
}
