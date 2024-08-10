package CollectionsAndGenericsMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Exercise 4: Phonebook
Objective:
Develop a simple phonebook application using a HashMap where you can add, remove, and search for contacts.

Instructions:

Use a HashMap<String, String> where the key is the contact's name and the value is their phone number.
Provide options to:
Add a new contact.
Remove a contact by name.
Search for a contact's phone number by name.
Display all contacts.
 */
public class Phonebook {
    private static Map<String, String> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exit = false;
        System.out.println("Welcome to the phonebook!");
        while (!exit) {
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove a contact by name");
            System.out.println("3. Search for a contact's phone number by name");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Please pick an option: ");

            int choice = input.nextInt();
            input.nextLine(); // clear the newline character

            switch (choice) {
                case 1:
                    addContact(input);
                    break;
                case 2:
                    removeContact(input);
                    break;
                case 3:
                    findNumber(input);
                    break;
                case 4:
                    displayPhoneBookInfo();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid input\n");
            }
        }
    }

    // method to add number
    public static void addContact(Scanner input) {
        System.out.print("\nEnter the name: ");
        String name = input.nextLine().trim();
        if (phoneBook.containsKey(name)) {
            System.out.println(name + " is already in the system.\n");
            return;
        }

        System.out.print("Enter the phone number: ");
        String phoneNumber = input.nextLine();
        String regex = "^\\d{10}$";

        if (!Pattern.matches(regex, phoneNumber)) {
            System.out.println("Please enter a valid number\n");
            return;
        }
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added successfully\n");
    }

    // method to remove contact
    public static void removeContact(Scanner input) {
        System.out.print("\n Enter a name to remove: ");
        String name = input.nextLine().trim();
        if(phoneBook.remove(name) != null) {
            System.out.println( "\n" + name + " has been removed\n");
        } else {
            System.out.println("\n" + name + " was not in the system.\n");
        }
    }

    // method for finding number
    public static void findNumber(Scanner input) {
        System.out.print("\nPlease enter a name: ");
        String name = input.nextLine().trim();
        String findingKey = phoneBook.get(name);

        if (findingKey != null) {
            System.out.println("\n" + name + "'s number is: " + findingKey + "\n");
        } else {
            System.out.println("\n" + name + " is not in the system.\n");
        }
    }

    // method to display info
    public static void displayPhoneBookInfo() {
        if (phoneBook.isEmpty()) {
            System.out.println("\nThere is no info in the phonebook.\n");
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println("\nName: " + entry.getKey() + ", Number: " + entry.getValue() + "\n");
            }
        }
    }
}
