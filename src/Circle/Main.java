package Circle;

import package2.C;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circumference: %.2f%n", circle.calculateCircumference());

        circle.setRadius(50);
        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circumference: %.2f%n", circle.calculateCircumference());

    }
}
