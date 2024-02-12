/*
This is my first practice question for Java.
Here I will create a program that will convert temperature.
We will convert Fahrenheit to Celsius.
I will be using variables, data types, and operators.
*/

public class PracticeQuestionOne {  // declares a member's access as public.
    public static void main(String[] args) {    // entry point for any Java program.
        int fahrenheit_temperature = 75;    // Declare Fahrenheit variable
        int fahrenheit_to_celsius =  (fahrenheit_temperature - 32) * 5 / 9; // Declare and create conversion to Celsius
        System.out.println
                (fahrenheit_temperature + "F to Celsius is " + fahrenheit_to_celsius + "C");  // Print calculations to terminal
    }
}
