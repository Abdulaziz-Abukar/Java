/*
Counting Digits: Write a program that counts the number of digits in a long number entered by the user.
 */
import java.util.Scanner;
public class CountingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a long number: ");
        long number = input.nextLong();

        int count = 0;

        if (number == 0) {
            count = 1;
        }

        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("The number of digits in the entered number is: " + count);

    }
}
