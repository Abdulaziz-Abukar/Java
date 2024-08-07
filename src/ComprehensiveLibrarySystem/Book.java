package ComprehensiveLibrarySystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    private String borrowedBy = null;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        this.borrowedBy = null;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed, String userName) {
        this.isBorrowed = isBorrowed;
        this.borrowedBy = isBorrowed ? userName : null;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author
        + ", ISBN: " + isbn + ", Borrowed: " + (isBorrowed ? "Yes, by " + borrowedBy : "No"));
    }
}
