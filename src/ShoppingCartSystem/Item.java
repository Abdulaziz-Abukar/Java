package ShoppingCartSystem;

public class Item {
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }

    public void displayItemInfo() {
        System.out.println("Item: " + itemName);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Quantity: " +  quantity);
    }
}
