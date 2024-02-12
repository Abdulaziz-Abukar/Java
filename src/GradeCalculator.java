/*
in this lesson, I will create a grade calculator program.
I will be using variables, data types, operators and else if statements.
 */

import java.util.Scanner;
public class GradeCalculator {  // public class name.
    public static void main(String[] args) {    // main entry point for java program.
        Scanner input = new Scanner(System.in); // Scanner object for user input.

        System.out.print("Please provide a test score percentage: "); // ask for user input.
        int userGrade = input.nextInt();    // read user input.

        if (userGrade >= 90) {
            System.out.println("You got an A+.");
        } else if (userGrade >= 80) {
            System.out.println("You got a A.");
        } else if (userGrade >=70) {
            System.out.println("You got a B.");
        } else if (userGrade >= 60) {
            System.out.println("You got a C.");
        } else if (userGrade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("you got an F.");
        }

    }

}
