/*
in this lesson, I will create a program that checks if a number if prime or not.
 */

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number");
        } else if (number == 2) {
            System.out.println("2 is a prime number.");
        } else {
            boolean isPrime = true; // Move the declaration inside the else block
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}

