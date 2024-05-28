import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.println("Let's create a multiplication table of a number!");
        System.out.println();

        try {
            // Get the user input
            System.out.print("Please provide me a number: ");
            int userInput = input.nextInt();

            // Maximum number for multiplication table
            int multiplicationMaxNum = 12;

            // Generate and print the multiplication table
            for (int i = 0; i <= multiplicationMaxNum; i++) {
                int product = userInput * i;
                System.out.println(userInput + " x " + i + " = " + product);
            }
        } catch (Exception e) {
            // Handle input errors
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the Scanner object
            input.close();
        }
    }
}
