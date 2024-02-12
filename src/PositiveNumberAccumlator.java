/*
Positive Number Accumulator:
Write a program that keeps asking the user to enter positive numbers.
The program should accumulate the sum of only positive numbers entered and should terminate when the user enters a negative number,
then display the accumulated sum.
 */

import java.util.Scanner;

public class PositiveNumberAccumlator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print("Please provide a positive number(Enter a negative number to exit) : ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Exiting Program...");
                break;
            }
            sum += number;
        }
        System.out.println("the sum for all positive numbers is " + sum);
    }
}
