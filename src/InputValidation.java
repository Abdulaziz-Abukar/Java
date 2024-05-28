/*
Input Validation:
Write a program that asks the user for a number between 1 and 10.
Use a do-while loop to keep asking for a number until the user enters a valid number within the range.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number between 1 and 10: ");
            try {
                int userInput = input.nextInt(); // Attempt to read an integer from the user

                // Check if the number is within the desired range
                if (userInput >= 1 && userInput <= 10) {
                    System.out.println("You entered a valid number: " + userInput);
                    break; // Exit the loop if valid
                } else {
                    System.out.println("Invalid input, provide a number only between 1 and 10.");
                }

                input.nextLine(); // Consume the newline character to avoid an infinite loop
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                input.next(); // Consume the invalid token to avoid an infinite loop
            }
        } while (true); // Continue looping until a valid input is provided
    }
}

