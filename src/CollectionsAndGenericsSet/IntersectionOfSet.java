package CollectionsAndGenericsSet;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
/*
Exercise 2: Intersection of Sets
Objective:
Write a program that finds the intersection of two sets of integers.

Steps:

Create two HashSet<Integer> objects.
Populate them with user input or predefined values.
Find the intersection of the two sets.
Print the intersection set.
Hints:

Use the retainAll() method to find the intersection.

 */
public class IntersectionOfSet {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Create first HashSet
        Set<Integer> setOne = new HashSet<>();

        // Create user input for 5 numbers on first set
        try {
            System.out.println("Please Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                int userInput = input.nextInt();
                setOne.add(userInput);
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer");
        }


        // Create second HashSet
        Set<Integer> setTwo = new HashSet<>();

        // Create user input for 5 numbers on second set
        try {
            System.out.println("Please enter 5 numbers for the second set:");
            for (int i = 0; i < 5; i++) {
                int userInput = input.nextInt();
                setTwo.add(userInput);
            }
        } catch(InputMismatchException e) {
            System.out.println("Enter a valid integer");
        }

        // Find the intersection between both sets
        boolean result = setOne.containsAll(setTwo);

        // Display results
        System.out.println("Intersection: " + result);

    }
}
