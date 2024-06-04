package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create an Inventory object
        Inventory inventory = new Inventory();

        // Create some Product objects
        Product product1 = new Product("P001", "Laptop", 999.99, 10);
        Product product2 = new Product("P002", "Smartphone", 599.99, 20);
        Product product3 = new Product("P003", "Tablet", 299.99, 15);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // List all products
        System.out.println("Listing all products:");
        inventory.listProducts();

        // Remove a product
        System.out.println("Removing product with ID P002");
        inventory.removeProduct("P002");

        // List all products again to see the change
        System.out.println("Listing all products after removal:");
        inventory.listProducts();

        // Update the quantity of a product
        System.out.println("Updating quantity of product with ID P001");
        product1.updateQuantity(5);

        // List all products again to see the updated quantity
        System.out.println("Listing all products after updating quantity:");
        inventory.listProducts();
    }
}
