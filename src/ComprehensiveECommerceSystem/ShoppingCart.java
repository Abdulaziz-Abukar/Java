package ComprehensiveECommerceSystem;
import java.util.ArrayList;
public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        int count = 0;
        for (Product product : products) {
            count++;
            System.out.println("Product: " + count);
            product.displayDetails();
            System.out.println();
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            if (products.isEmpty()) {
                return 0;
            }
            total += product.price;
        }
        return total;
    }
}
