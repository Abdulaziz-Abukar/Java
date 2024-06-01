package OOPCars; // Declares the package for organizing related classes

public class Main {
    public static void main(String[] args) {
        // Creating two Car objects using the Car class
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        // Accessing and printing the fields of the first Car object
        System.out.println(myCar1.make); // Prints the make of myCar1
        System.out.println(myCar1.model); // Prints the model of myCar1
        // System.out.println(myCar1.color); // (Commented out) Would print the color of myCar1
        // System.out.println(myCar1.price); // (Commented out) Would print the price of myCar1

        System.out.println(); // Prints a blank line for separation

        // Accessing and printing the fields of the second Car object
        System.out.println(myCar2.make); // Prints the make of myCar2
        System.out.println(myCar2.model); // Prints the model of myCar2

        // myCar1.drive(); // (Commented out) Would call the drive method on myCar1
        // myCar1.brake(); // (Commented out) Would call the brake method on myCar1
    }
}
