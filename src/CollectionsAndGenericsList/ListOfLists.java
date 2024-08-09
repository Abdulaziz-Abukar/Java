package CollectionsAndGenericsList;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

    public static void main(String[] args) {
        // create a list of list<String> to hold student names for different classes
        List<List<String>> allClasses = new ArrayList<>();

        // Create first class list
        List<String> classOne = new ArrayList<>();
        classOne.add("Bob");
        classOne.add("Chelsea");
        classOne.add("Craig");

        // Create second class list
        List<String> classTwo = new ArrayList<>();
        classTwo.add("Ashley");
        classTwo.add("Saber");
        classTwo.add("Donald");

        // create third class
        List<String> classThree = new ArrayList<>();
        classThree.add("Jacob");
        classThree.add("Michael");
        classThree.add("Trevor");

        // add all classes to main list
        allClasses.add(classOne);
        allClasses.add(classTwo);
        allClasses.add(classThree);

        // print all student names
        System.out.println("All students before modification");
        printAllStudents(allClasses);

        // Modify student name
        classThree.set(1, "Allen");

        // reprint modified student list
        System.out.println("All students after modification");
        printAllStudents(allClasses);
    }

    public static void printAllStudents(List<List<String>> classes) {
        for (int i = 0; i < classes.size(); i++) {
            System.out.println("\nClass " + (i + 1) + ":\n");

            for (String student : classes.get(i)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }
}
