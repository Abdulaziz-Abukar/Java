/*
Exercise 5: E-commerce Order System
Create an Order class that manages a list of products in an order.

Product Class:
Fields: productId, productName, price
Constructor: Initialize all fields

Order Class:
Fields: orderId, products (an ArrayList of Product objects)
Constructor: Initialize orderId and an empty products list
Methods:
addProduct(Product product): Adds a product to the order.
removeProduct(String productId): Removes a product by its ID.
listProducts(): Prints the details of all products in the order.
calculateTotal(): Calculates and returns the total cost of all products in the order.
 */

package ECommerceOrderSystem;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("PRODUCT1", "Grapes", 6.50);
        Product product2 = new Product("PRODUCT2", "Apples", 10.50);
        Product product3 = new Product("PRODUCT3", "Oranges", 2.00);

        Order order = new Order("52567");

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        double totalCost = order.calculateTotal();

        System.out.printf("Total for today will be: %.2f%n", totalCost);
    }
}
