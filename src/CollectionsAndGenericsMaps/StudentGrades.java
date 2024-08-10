package CollectionsAndGenericsMaps;
import java.util.InputMismatchException;
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
    private static HashMap<String, Double> studentGrades = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a student and their grade");
            System.out.println("2. Remove a student by name");
            System.out.println("3. Display all students and their grades");
            System.out.println("4. Find a student's grade by name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    removeStudent(input);
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    findStudentGrade(input);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        input.close();
    }

    private static void addStudent(Scanner input) {
        System.out.print("Enter student name: ");
        String name = input.nextLine().trim();
        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Use a different name.");
            return;
        }

        System.out.print("Enter student grade: ");
        try {
            double grade = input.nextDouble();
            input.nextLine(); // Clear the newline character
            studentGrades.put(name, grade);
            System.out.println("Student added: " + name + " with grade " + grade);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Grade must be a number.");
            input.nextLine(); // Clear the invalid input
        }
    }

    private static void removeStudent(Scanner input) {
        System.out.print("Enter student name to remove: ");
        String name = input.nextLine().trim();
        if (studentGrades.remove(name) != null) {
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    private static void displayAllStudents() {
        if (studentGrades.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student Grades:");
            for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
            }
        }
    }

    private static void findStudentGrade(Scanner input) {
        System.out.print("Enter student name to find: ");
        String name = input.nextLine().trim();
        Double grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Student " + name + " has a grade of " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }
}