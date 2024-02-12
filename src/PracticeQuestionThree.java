/*
This is my third practice question for Java.
In this practice question, I will be creating a program to find an average of three numbers.
I will be using variables, data types, and operators in this program lesson.
*/

public class PracticeQuestionThree {    // declares a member's access as public.
    public static void main(String[] args) {    // entry point for Java programs.
        int number_one = 6; // declare first number.
        int number_two = 9; // declare second number.
        int number_three = 4;   // declare third number.

        // Create a variable to store the sum of the three numbers.
        int sumOfNumbers = number_one + number_two + number_three;

        // create a variable to store the average number of the total amount of numbers.
        int averageOfNumber = sumOfNumbers / 3;

        // print findings on the terminal.
        System.out.println("The average of " + number_one + ", " + number_two + ", and " + number_three + " is: " +
                averageOfNumber);
    }
}
