import java.util.Scanner;

public class FindingEvenOrOddNum {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Let's find out if a number is even or odd!");
        System.out.print("Please provide a number: ");
        int num_input = input.nextInt();

        // Check if the number is even or odd
        if (num_input % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }

        // Close the Scanner object
        input.close();
    }
}
