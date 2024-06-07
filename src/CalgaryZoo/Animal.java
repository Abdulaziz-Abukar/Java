package CalgaryZoo;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}
