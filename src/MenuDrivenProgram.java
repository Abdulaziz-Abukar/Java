/*
Menu Driven Program:
Create a program with a menu of options for the user to select from (e.g., 1. Print Hello, 2. Print How are you?, 3. Exit).
Use a do-while loop to keep showing the menu and performing the selected actions until the user chooses to exit.
 */

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userOption = 0; // Initialized to 0 to enter the loop

        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Print Hello");
            System.out.println("2. Print How are you?");
            System.out.println("3. Lets have fun!");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");

            try {
                userOption = Integer.parseInt(input.nextLine()); // Parse the user input
                switch (userOption) {
                    case 1:
                        System.out.println("Hello!");
                        break;
                    case 2:
                        System.out.println("How are you?");
                        break;
                    case 3:
                        System.out.println("Lets have fun!");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid Input. Please enter a number between 1 and 4.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a valid number.");
            }
        } while (userOption != 4);

        input.close(); // Close the scanner to prevent resource leak
    }
}
