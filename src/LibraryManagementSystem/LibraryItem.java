package LibraryManagementSystem;

abstract class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayInfo();
}
