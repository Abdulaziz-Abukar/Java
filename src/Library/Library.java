package Library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Books> books;

    // Constructor
    public Library() {

        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Books book) {
        books.add(book);
        System.out.println("The book \"" + book.getIsbn() + "\" has been added to the library.");
    }

    // Method to remove a book from the library by ISBN
    public void removeBook(String isbn) {
        boolean found = false;
        for (Books book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("The book with ISBN \"" + isbn + "\" has been removed from the library.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book with ISBN \"" + isbn + "\" was not found in the library.");
        }
    }

    // Method to list all available books
    public void listAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Books book : books) {
            if (!book.isBorrowed()) {
                book.displayBookInfo();
                System.out.println();
            }
        }
    }
}
