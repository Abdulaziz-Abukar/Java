/*
in this lesson I will create a factorial calculator.
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner Object for user input

        System.out.print("Please Provide a number: ");
        int number = input.nextInt();   // Read user input

        long factorial = 1; // declare factorial variable to 1

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " Is: " + factorial);
    }
}
