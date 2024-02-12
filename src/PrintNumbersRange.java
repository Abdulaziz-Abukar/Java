/*
in this lesson I will create a print numbers in range program.
Using a for loop, write a program that prints all the numbers from 1 to N, where N is an integer provided by the user.
However, for multiples of three, print "Fizz" instead of the number, and for multiples of five, print "Buzz".
For numbers which are multiples of both three and five, print "FizzBuzz".
 */

import java.util.Scanner;
public class PrintNumbersRange {    // public class.
    public static void main(String[] args) { // main entry point for java program.
        Scanner input = new Scanner(System.in); // Create object for user input.

        System.out.print("Please provide a number: ");  // ask for user input.
        int number = input.nextInt();   // read user input.

        for (int i = 1; i <= number; i++) { // create a for loop using the number provided by user.

            if (i % 3 == 0 && i % 5 == 0) { // if user input multiplies by 3 and 5 print fizzbuzz.
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");// if user input multiplies by 3 fizz.
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // if user input multiplies by 5 buzz.
            } else {
                System.out.println(i); // if none of the above, print number.
            }
        }
    }
}
