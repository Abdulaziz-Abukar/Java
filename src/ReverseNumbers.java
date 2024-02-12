/*
Reverse a Number: Implement a program that reverses a given integer (e.g., input: 12345, output: 54321).
 */

import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
