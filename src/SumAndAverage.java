/*
Sum and Average:
Write a program that continuously accepts positive numbers from the user and calculates the sum and average of these numbers.
The program should terminate when a negative number is entered, and then it should display the final sum and average.
 */

import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true) {
            System.out.print("Please provide a number: ");
            int number = input.nextInt();
            if (number < 0) {
                break;
            } else {
                sum += number;
                count++;
            }
        }
        if (count > 0) {
            int average = sum / count;
            System.out.println(average + " is the average of the inputted numbers");
            System.out.println(sum + " is the sum of the inputted numbers");
        } else {
            System.out.println("No positive numbers were entered.");
        }
    }
}
