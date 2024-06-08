package ComprehensiveECommerceSystem;

public class Food extends Product{
    String expiryDate;

    public Food(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
