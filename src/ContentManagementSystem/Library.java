package ContentManagementSystem;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Pragmatic Programmer", "Douglas");

        book.borrowItem();
        book.returnItem();
    }
}
