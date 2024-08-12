package GenericContainerClass;

// Define a generic Container class
class Container<T> {
    private T item;
    private int quantity;

    // Constructor to initialize the container with an item and quantity
    public Container(T item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Method to get the item
    public T getItem() {
        return item;
    }

    // Method to get the quantity
    public int getQuantity() {
        return quantity;
    }

    // Method to add to the quantity
    public void addQuantity(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to add cannot be negative");
        }
        quantity += amount;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
