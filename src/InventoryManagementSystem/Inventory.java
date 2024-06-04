package InventoryManagementSystem;
import java.util.ArrayList;
public class Inventory {
    ArrayList<Product> products;


    public Inventory() {
        products = new ArrayList<>();

    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public void removeProduct(String productId) {
        products.removeIf(product -> product.getProductId().equals(productId));
    }

    public void listProducts() {
        for (Product product : products) {
            product.displayProductInfo();
            System.out.println();
        }
    }
}
