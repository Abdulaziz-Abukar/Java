/*
This is my seventh practice question.
I will be creating a program that converts minutes into number of years and days.
To create this, I will only use variables, data types,and operators.
 */

public class PracticeQuestionSeven {    // create a member's class for public
    public static void main(String[] args) {    // Entry point for Java program.

        double minutesInYear = 60 * 24 * 365; // Correct calculation for minutes in a year

        double numOfMinutes = 550000; // Example number of minutes

        long numOfYears = (long) (numOfMinutes / minutesInYear); // Correct casting and calculation for years
        int numOfDays = (int) (numOfMinutes / 60 / 24) % 365; // Correct casting and calculation for days

        // Corrected variable names to match those declared
        System.out.println((int) numOfMinutes + " minutes is approximately " + numOfYears + " year(s) and " + numOfDays + " day(s)");
    }
}
