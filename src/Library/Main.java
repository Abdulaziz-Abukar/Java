package Library;

public class Main {
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();

        // Create some Book objects
        Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Books book2 = new Books("1984", "George Orwell", "987654321");
        Books book3 = new Books("To Kill a Mockingbird", "Harper Lee", "123459876");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Borrow a book
        book1.borrowBook();

        book1.displayBookInfo();

        // List available books
        library.listAvailableBooks();

        // Return a book
        book1.returnBook();

        // List available books again
        library.listAvailableBooks();

        // Remove a book
        library.removeBook("123456789");

        // List available books again
        library.listAvailableBooks();
    }
}
