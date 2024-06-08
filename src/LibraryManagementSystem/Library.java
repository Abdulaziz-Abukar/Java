package LibraryManagementSystem;
import java.util.ArrayList;
public class Library {
    ArrayList<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayInfo();;
            System.out.println();
        }
    }

    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.title.equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}
