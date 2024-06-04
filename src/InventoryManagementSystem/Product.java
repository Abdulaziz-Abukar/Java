package InventoryManagementSystem;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);

    }

    public int updateQuantity(int newQuantity) {
        return this.quantity = newQuantity;
    }

    public String getProductId() {
        return productId;
    }
}
