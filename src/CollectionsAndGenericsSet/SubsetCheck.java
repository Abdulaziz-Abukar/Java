package CollectionsAndGenericsSet;
import java.util.HashSet;
import java.util.Set;

/*
Exercise 5: Subset Check
Objective:
Write a program that checks if one set is a subset of another.

Steps:

Create two HashSet<String> objects.
Populate them with some values where one set is a subset of the other.
Check if the first set is a subset of the second set.
Print the result.
Hints:

Use the containsAll() method to check for subset relationships.
 */

public class SubsetCheck {
    public static void main(String[] args) {
        // Create two HashSet<String> objects
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Populate set1 with some values
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        // Populate set2 with values including all elements of set1
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");
        set2.add("Elderberry");

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        // Print the result
        if (isSubset) {
            System.out.println("Set1 is a subset of Set2.");
        } else {
            System.out.println("Set1 is not a subset of Set2.");
        }

    }
}
