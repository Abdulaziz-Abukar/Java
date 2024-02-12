/*
This is my fourth practice question in Java.
I will create a program that swaps two Numbers without using a temporary variable.
In this lesson I will be using variables, data types, and operators.
*/


public class PracticeQuestionFour {
    public static void main(String[] args) {
        int a = 5, b = 10; // declare both numbers.

        System.out.println("Before swap: a = " + a + ", b = " + b); // print what it is before.

        // Step 2
        a = a + b;
        // Step 3
        b = a - b;
        // Step 4
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b); // print what it is after.
    }
}
