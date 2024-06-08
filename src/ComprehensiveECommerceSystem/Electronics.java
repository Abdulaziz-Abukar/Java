package ComprehensiveECommerceSystem;

public class Electronics extends Product{
    int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Warranty Period: " + warrantyPeriod);
    }
}
