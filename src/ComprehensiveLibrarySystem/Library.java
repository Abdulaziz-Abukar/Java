package ComprehensiveLibrarySystem;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books available in the library");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    // method to borrow book

    public void borrowBook(String isbn, String userName) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true, userName);
                    System.out.println("You have borrowed: " + book.getTitle());
                } else {
                    System.out.println("Sorry, the book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library");
    }


    // method to return book
    public void returnBook(String isbn, String userName) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isBorrowed()) {
                book.setBorrowed(false, null);
                System.out.println(userName + " has returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("The book is not found or was not borrowed.");
    }

    public int getNumberOfBorrowedBooks(String userName) {
        int count = 0;
        for (Book book : books) {
            if (book.isBorrowed() && userName.equals(book.getBorrowedBy())) {
                count++;
            }
        }
        return count;
    }
}
