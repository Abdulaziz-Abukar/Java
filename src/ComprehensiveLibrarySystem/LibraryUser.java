package ComprehensiveLibrarySystem;

public interface LibraryUser {
    void borrowBook(Library library, String isbn);
    void returnBook(Library library, String isbn);
}
