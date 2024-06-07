package AnimalHierarchy;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Simba";
        lion.age = 5;
        lion.furColor = "Golden";
        lion.makeSound();  // Inherited from Animal
        lion.walk();       // Inherited from Mammal
        lion.roar();       // Defined in Lion

        Eagle eagle = new Eagle();
        eagle.name = "Eagle Eye";
        eagle.age = 3;
        eagle.wingSpan = 2.5;
        eagle.makeSound(); // Inherited from Animal
        eagle.fly();       // Inherited from Bird
        eagle.screech();   // Defined in Eagle
    }
}

