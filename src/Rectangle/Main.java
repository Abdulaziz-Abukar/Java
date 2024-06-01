package Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.10, 20.20);

        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
}
