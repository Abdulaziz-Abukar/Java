package CollectionsAndGenericsSet;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/*
Exercise 3: Remove Duplicates from a List
Objective:
Write a program that removes duplicate elements from a list using a Set.

Steps:

Create a List<Integer> with some duplicate values.
Convert the list to a HashSet to remove duplicates.
Convert the set back to a list.
Print the list without duplicates.
Hints:

Use new ArrayList<>(set) to convert a set back to a list.
 */

public class RemoveDuplicatesFromSet {
    public static void main(String[] args) {
        // Creates List <Integer>
        List<Integer> list = new ArrayList<>();
        // Add elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        // display initial list
        System.out.println("Initial List:");
        for (Integer numbers : list) {
            System.out.println(numbers);
        }

        // Create a set and pass in the list as a parameter
        Set<Integer> set = new HashSet<>(list);

        // Print out numbers in set (Should remove duplicates)
        System.out.println("\nNumbers in set:");
        for (Integer numbers : set) {
            System.out.println(numbers);
        }

        // Convert set back to list

        List<Integer> listFromSet = new ArrayList<>(set);

        // Print out numbers in list
        System.out.println("\nNumbers in list:");
        for (Integer numbers : listFromSet) {
            System.out.println(numbers);
        }
    }
}
