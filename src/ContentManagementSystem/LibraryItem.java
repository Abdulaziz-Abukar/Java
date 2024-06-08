package ContentManagementSystem;

abstract class LibraryItem implements Borrowable{
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void displayInfo();
}
