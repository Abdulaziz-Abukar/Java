package ECommerceOrderSystem;
import java.util.ArrayList;
public class Order {

    private String orderId;
    ArrayList<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " Has been added to order.");
    }

    public void removeProduct(String productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(productId)) {
                products.remove(i);
                System.out.println("Product has been removed.");
                return;
            }
        }
        System.out.println("Product not found in orders.");
    }

    public void listProducts() {
        for (Product product: products) {
            product.getProductInfo();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
