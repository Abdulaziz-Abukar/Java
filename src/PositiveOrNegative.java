/*
In this lesson,
I will create a program that will take an integer input from the user and print whether the number is positive or negative
in this program I will be using variables, data types, operators, and if else statements.
 */

import java.util.Scanner;

public class PositiveOrNegative {   // public class for members access
    public static void main(String[] args) {    // main entry point for java programs
        Scanner input = new Scanner(System.in); // create the scanner variable name.

        System.out.print("Please provide me with a number: ");  // ask for user input.
        int userInput = input.nextInt();    // catch user input.

        if (userInput >= 0) {   // create a statement for whether the input is above 0.
            System.out.println(userInput + " Is a positive number.");   // if yes, execute this code.
        } else {
            System.out.println(userInput + " is a negative number.");   // if no, execute this code.
        }
    }
}
