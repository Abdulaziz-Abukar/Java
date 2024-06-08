package ComprehensiveECommerceSystem;

public class Clothing extends Product{
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Size: " + size);
    }
}
