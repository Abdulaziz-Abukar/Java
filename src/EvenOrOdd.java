/*
in this Practice question, I will create a program that finds out whether a number is even or odd.
I will be using variables, data types, operators and if statements.
 */

import java.util.Scanner;

public class EvenOrOdd { // public class for member's access.
    public static void main(String[] args) {    // entry point for java program.
        Scanner input = new Scanner(System.in); // create a Scanner variable name.

        System.out.print("Please provide a number: ");  // ask for user input.
        int number_input = input.nextInt(); // catch user input here.

        // create an if statement to check if the number is even or odd.
        if (number_input % 2 == 0) {    // if the number is divisible by 2 and has a remainder of 0.
            System.out.println(number_input + " is even"); // print in terminal it is even.
        } else {    // if the number is divisible by 2 but has a remainder above 0.
            System.out.println(number_input + " is odd");   // print in terminal it is odd.
        }

    }
}
