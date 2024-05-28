/*
Method Overloading for Adding

Overload a method add that takes either two or three integers as parameters and returns their sum.
 */

import java.util.Scanner;

public class MethodOverloading {

    // Method overloading: Same method name, but different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: Same method name, but with three parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please provide a number: ");
            int num1 = input.nextInt();
            System.out.print("Please provide a second number: ");
            int num2 = input.nextInt();

            // Consume the leftover newline
            input.nextLine();

            System.out.print("Do you want to provide a third number? (Y or N): ");
            String userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("Y")) {
                System.out.print("Please provide a third number: ");
                int num3 = input.nextInt();
                // Call the overloaded add method with three parameters
                System.out.println("The sum of the three numbers is: " + add(num1, num2, num3));
            } else {
                // Call the add method with two parameters
                System.out.println("The sum of the two numbers is: " + add(num1, num2));
            }

            // Consume the leftover newline if the user entered a third number
            if (userChoice.equalsIgnoreCase("Y")) {
                input.nextLine();
            }

            // Ask the user if they want to continue or exit
            System.out.print("Do you want to add more numbers? (Y or N): ");
            String continueChoice = input.nextLine();
            if (!continueChoice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting...");
                break; // Exit the while loop and end the program
            }
        }

        input.close(); // Close the scanner to prevent resource leak
    }
}
