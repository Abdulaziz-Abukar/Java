package ComprehensiveECommerceSystem;

abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void displayDetails();
}
