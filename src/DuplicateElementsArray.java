/*
Duplicate Elements: Write a program to find all duplicate elements in an integer array.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        Set<Integer> seen = new HashSet<>(); // To keep track of seen numbers
        Set<Integer> duplicates = new HashSet<>(); // To keep track of duplicates

        for (int i = 0; i < numbers.length; i++) {
            if (!seen.add(numbers[i])) { // add() returns false if the element was already in the set
                duplicates.add(numbers[i]);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers are: " + duplicates);
        }

        input.close();
    }
}

