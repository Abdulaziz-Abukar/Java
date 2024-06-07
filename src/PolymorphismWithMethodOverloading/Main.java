package PolymorphismWithMethodOverloading;


import package2.C;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];

        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Triangle();

        for (Shape shapes : shape) {
            shapes.draw();
            shapes.description();
        }
    }
}
