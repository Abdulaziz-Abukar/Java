package ContentManagementSystem;

public class Book extends LibraryItem{
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    @Override
    public void borrowItem() {
        System.out.println(title + " Has been borrowed");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " Has been returned.");
    }


}
