package ShapesWithPolymorphism;

public class Main {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shapes[] shapes = new Shapes[3];

        // Instantiate the array with Circle, Square, and Triangle objects
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Loop through the array and call the draw() method on each object
        for (Shapes shape : shapes) {
            shape.draw();
        }
    }
}
