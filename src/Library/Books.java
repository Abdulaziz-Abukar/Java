package Library;

public class Books {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // Constructor
    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    // Method to borrow the book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is already borrowed.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book \"" + title + "\" has been returned.");
        } else {
            System.out.println("The book \"" + title + "\" was not borrowed.");
        }
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    // Getters for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Getter for isBorrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }
}


