/*
Collatz Conjecture:
Implement a program that takes a positive integer from the user and then applies the Collatz conjecture
(also known as the 3n + 1 problem) until the number reaches 1. The rules are:

If the number is even, divide it by 2.
If the number is odd, multiply it by 3 and add 1.
Count how many steps it takes to reach 1.
 */

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please Provide a positive number (or a negative number to exit): ");
            int number = input.nextInt();
            if (number <= 0) {
                System.out.println("Exiting the program.");
                break;
            }

            int count = 0; // Reset the step count for each new number
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = number * 3 + 1;
                }
                count++;
                System.out.println("Current number: " + number);
            }

            System.out.println("It took " + count + " steps to reach 1 for the initial number.");
        }
    }
}