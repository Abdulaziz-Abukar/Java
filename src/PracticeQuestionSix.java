/*
This is my Sixth practice question.
I will create a program that will calculate simple interests.
I will be using strictly variables, data types, and operators.
 */

public class PracticeQuestionSix { // creating a public member's class.
    public static void main(String[] args) {    // entry point for Java program.
        int principle_amount = 50000; // declare principle amount.
        int rate_amount = 10;   // declare the rate.
        int time_amount_in_years = 2;   // declare the amount of years.

        // calculate the interest amount based on the declare variables of principle, amount and years.
        int simpleInterest = (principle_amount * rate_amount * time_amount_in_years) / 100;

        // display findings on terminal.
        System.out.println("The interest amount is: " + simpleInterest);
    }
}
