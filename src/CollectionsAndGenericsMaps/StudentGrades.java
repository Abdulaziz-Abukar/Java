package CollectionsAndGenericsMaps;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
/*
Exercise 2: Student Grades
Objective:
Write a program that maintains a list of students and their grades using a HashMap.
Allow the user to perform operations such as adding, removing, and displaying student grades.

Instructions:

Use a HashMap<String, Double> where the key is the student's name and the value is their grade.
Provide options to:
Add a student and their grade.
Remove a student by name.
Display all students and their grades.
Find a student's grade by name.
 */
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Double> studentGrades = new HashMap<>();

        System.out.println("Welcome to student grade portal\n");
        do {
           myMenu();
            System.out.print("Please choose an option: ");
            int userInput = input.nextInt();
            if (userInput == 5) {
                break;
            }

            switch (userInput) {
                case 1:
                    System.out.print("Please enter a name: ");
                    String name = input.nextLine();
                    input.next();
                    System.out.print("Please provide a grade: ");
                    Double grade = input.nextDouble();
                    addStudent(name, grade, studentGrades);
                    break;

                case 2:
                    System.out.print("Please enter their name: ");
                    name = input.nextLine();
                    input.next();
                    removeStudent(name, studentGrades);
                    break;
            }

        } while (true);
    }

    public static void myMenu() {
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. Display all students and their grades");
        System.out.println("4. Find a student's grades by name");
        System.out.println("5. to quit\n");
    }

    public static void addStudent(String name, Double grade, Map<String, Double> map) {
        map.put(name, grade);
        System.out.println("\nStudent has been added\n");
    }

    public static void removeStudent(String name, Map<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("Student has been removed!\n");
            } else {
                System.out.println("Student was not found in the system\n");
            }
        }
    }
}
