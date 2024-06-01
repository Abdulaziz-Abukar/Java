package OOPBooks;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Hamlet", "Shakespeare", 65.00);
        Books book2 = new Books("Bones", "Kathy Reichs", 50.45);

        book1.getTitle();
        book1.getAuthor();
        book1.getPrice();

        System.out.println();

        book2.getTitle();
        book2.getAuthor();
        book2.getPrice();

        System.out.println();

        book1.setTitle("Bro");
        book1.setAuthor("Abdul");
        book1.setPrice(10.54);
        book1.getTitle();
        book1.getAuthor();
        book1.getPrice();

        System.out.println();

        book2.setTitle("Dumpy the Wumpy");
        book2.setAuthor("Tinoz");
        book2.setPrice(1.00);

        book2.getTitle();
        book2.getAuthor();
        book2.getPrice();
    }
}
