package LibraryManagementSystem;

public class Book extends LibraryItem{
    int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }
    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
