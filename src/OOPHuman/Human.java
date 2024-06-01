package OOPHuman; // Declares the package for organizing related classes

public class Human {

    // Fields (attributes) of the Human class
    String name; // The name of the human
    int age; // The age of the human
    double weight; // The weight of the human

    // Constructor to initialize the fields
    Human(String name, int age, double weight) {
        this.name = name; // Assigns the name parameter to the name field
        this.age = age; // Assigns the age parameter to the age field
        this.weight = weight; // Assigns the weight parameter to the weight field
    }

    // Method to simulate eating
    void eat() {
        System.out.println(this.name + " is eating."); // Prints a message when the human is eating
    }

    // Method to simulate drinking
    void drink() {
        System.out.println(this.name + " is drinking. *burp*"); // Prints a message when the human is drinking
    }
}
