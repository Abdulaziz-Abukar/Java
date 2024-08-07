/*
This program will be created for checking to see if a year is a leap year.
In this program I will be using variables, data types, operators, and if else statements.
 */

import java.util.Scanner;

public class LeapYearChecker {  // Class name.
    public static void main(String[] args) {    // Main method.
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input.

        System.out.print("Please provide me a year: "); // ask for user input.
        int year = input.nextInt();    // catch user input.

        // Leap year condition check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }



    }

}
