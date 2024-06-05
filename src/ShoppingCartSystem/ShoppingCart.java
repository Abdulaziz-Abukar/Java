package ShoppingCartSystem;
import java.util.ArrayList;
public class ShoppingCart {
    ArrayList<Item> items;


    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemName().equals(itemName)) {
             items.remove(i);
                System.out.println(itemName + " Has been removed.\n");
             return;
            }
        }
        System.out.println(itemName + " is not in list.\n");
    }

    public void listItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.getItemName());
        }
    }
}
