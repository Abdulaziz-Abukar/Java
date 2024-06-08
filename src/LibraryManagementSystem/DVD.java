package LibraryManagementSystem;

public class DVD extends LibraryItem{
    double duration;

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration);
    }
}
