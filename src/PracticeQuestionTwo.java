/*
This is my second practice question.
I will be creating a program that calculates and displays the circumference and area of a circle.
I will be using variables, data types, and operators.
*/

public class PracticeQuestionTwo {  // declares a member's access as public.
    public static void main(String[] args) { // entry point for any Java program.
        double radius_number = 25.24;   // declare radius number.

        double circumferenceOfCircle = 2 * Math.PI * radius_number; // create circumference of circle formula.

        double areaOfCircle = Math.PI * Math.pow(radius_number, 2); // create area of circle formula.

        System.out.println("The circumference of a circle with radius " + radius_number + " is " + circumferenceOfCircle);  // print calculations to terminal.
        System.out.println("The area of a circle with radius " + radius_number + " is " + areaOfCircle); // print calculations to terminal.



    }
}
