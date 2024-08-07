package ComprehensiveLibrarySystem;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, LibraryUser> users = new HashMap<>(); // Stores users with ID as key

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library publicLibrary = new Library();

        System.out.println("Welcome to the Library!\n");
        String userInput;

        do {
            System.out.println("Press enter to begin... (or type 'Quit' to end the program)");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Quit")) {
                System.out.println("Goodbye");
                break;
            } else if (userInput.isEmpty()) {
                menuProgram(publicLibrary, input);
            } else {
                System.out.println("Invalid input. Please press enter to continue or type 'Quit' to end the program");
            }
        } while (true);

        input.close();
    }

    static void menuProgram(Library library, Scanner input) {
        while (true) {
            System.out.println("\nHere is our Menu:");
            System.out.println("1. Register as Student");
            System.out.println("2. Register as Teacher");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. View available books");
            System.out.println("6. Add a new book");
            System.out.println("7. Exit to main menu");
            System.out.print("Select an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    registerStudent(input);
                    break;
                case "2":
                    registerTeacher(input);
                    break;
                case "3":
                    borrowBook(library, input);
                    break;
                case "4":
                    returnBook(library, input);
                    break;
                case "5":
                    library.viewBooks();
                    break;
                case "6":
                    addNewBook(library, input);
                    break;
                case "7":
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void registerStudent(Scanner input) {
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Enter your student ID number: ");
        int studentIdNumber = Integer.parseInt(input.nextLine());

        Student student = new Student(name, age, studentIdNumber);
        users.put(studentIdNumber, student);

        System.out.println("Student registered successfully!");
    }

    private static void registerTeacher(Scanner input) {
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Enter your teacher ID number: ");
        int teacherIdNumber = Integer.parseInt(input.nextLine());

        Teacher teacher = new Teacher(name, age, teacherIdNumber);
        users.put(teacherIdNumber, teacher);

        System.out.println("Teacher registered successfully!");
    }

    private static void borrowBook(Library library, Scanner input) {
        System.out.print("Enter your ID number: ");
        int idNumber = Integer.parseInt(input.nextLine());

        LibraryUser user = users.get(idNumber);
        if (user != null) {
            System.out.print("Enter ISBN of the book to borrow: ");
            String isbn = input.nextLine();
            user.borrowBook(library, isbn);
        } else {
            System.out.println("User not found. Please register first.");
        }
    }

    private static void returnBook(Library library, Scanner input) {
        System.out.print("Enter your ID number: ");
        int idNumber = Integer.parseInt(input.nextLine());

        LibraryUser user = users.get(idNumber);
        if (user != null) {
            System.out.print("Enter ISBN of the book to return: ");
            String isbn = input.nextLine();
            user.returnBook(library, isbn);
        } else {
            System.out.println("User not found. Please register first.");
        }
    }

    private static void addNewBook(Library library, Scanner input) {
        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter book author: ");
        String author = input.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = input.nextLine();
        library.addBook(new Book(title, author, isbn));
    }
}

