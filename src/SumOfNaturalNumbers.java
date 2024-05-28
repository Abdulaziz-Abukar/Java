import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 10; // Number up to which sum is to be calculated
        int sum = 0;  // Variable to store the sum

        // Loop to calculate the sum
        for (int i = 1; i <= num; i++) { // Start from 1 instead of 0
            sum += i;
        }

        // Print the result
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
    }
}
