/*
Guessing Game: Create a simple guessing game where the program selects a random number between 1 and 100, and the user has to guess it.
After each guess, the program should say if the guess is too high, too low, or correct.
Use a do-while loop to keep asking the user for a guess until they get it right.
 */

import java.util.Scanner;
import java.lang.Math;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);


        do {
            System.out.print("Please guess a number: ");
            try {
                int numberGuessed = 0; // Not necessary to initialize here, but done for clarity
                numberGuessed = input.nextInt();

                if (numberGuessed > randomNumber) {
                    System.out.println("Too high, try lower!");
                } else if (numberGuessed < randomNumber) {
                    System.out.println("Too low, try higher!");
                } else {
                    System.out.println("You guessed it!");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer number.");
                input.next(); // Consume the invalid input
                // No need for continue; the loop will prompt again
            }
        } while (numberGuessed != randomNumber);

        input.close(); // Close the scanner to release the resource
    }
}

