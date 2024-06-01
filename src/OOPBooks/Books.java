package OOPBooks;

public class Books {

    private String title;
    private String author;
    private double price;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getTitle() {
        System.out.println(this.title);
    }

    public void getAuthor() {
        System.out.println(this.author);
    }

    public void getPrice() {
        System.out.println(this.price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
