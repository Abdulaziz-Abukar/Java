/*
Palindrome Number Checker: Write a program that checks if a number is a palindrome
(a number that reads the same backward as forward).
 */

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give me 2 or more numbers: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while(number != 0) {
            int digit = number % 10;    // get the last digit
            reversedNumber = reversedNumber * 10 + digit;   // append the digit to the reversed number
            number /= 10;   // remove the last digit number
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " Is not a palindrome.");
        }
    }
}
