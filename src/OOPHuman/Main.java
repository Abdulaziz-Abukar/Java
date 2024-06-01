package OOPHuman; // Declares the package for organizing related classes

public class Main {
    public static void main(String[] args) {
        // Constructor = special method that is called when an object is instantiated (Created)

        // Creating two Human objects using the Human class
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        // Accessing and printing the fields of the first Human object
        System.out.println(human1.name); // Prints the name of human1
        human1.drink(); // Calls the drink method on human1
        // System.out.println(human1.age); // (Commented out) Would print the age of human1
        // System.out.println(human1.weight); // (Commented out) Would print the weight of human1

        // Accessing and printing the fields of the second Human object
        System.out.println(human2.name); // Prints the name of human2
        human2.eat(); // Calls the eat method on human2
    }
}
