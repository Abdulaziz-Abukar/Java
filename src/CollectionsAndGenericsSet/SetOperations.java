package CollectionsAndGenericsSet;
import java.util.HashSet;
import java.util.Set;

/*
Exercise 4: Set Operations
Objective:
Write a program that demonstrates basic set operations: union, intersection, and difference.

Steps:

Create two HashSet<String> objects.
Populate them with some values.
Demonstrate the union operation and print the result.
Demonstrate the intersection operation and print the result.
Demonstrate the difference operation and print the result.
Hints:

Use addAll() for union, retainAll() for intersection, and removeAll() for difference.
 */
public class SetOperations {
    public static void main(String[] args) {
        // Create first HashSet
        Set<Integer> setOne = new HashSet<>();
        // Add values in first HashSet
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);

        // Create second HashSet
        Set<Integer> setTwo = new HashSet<>();

        // add values in second HashSet
        setTwo.add(6);
        setTwo.add(7);
        setTwo.add(3);
        setTwo.add(1);

        // Find Union
        Set<Integer> union = new HashSet<>(setOne);
        union.addAll(setTwo);

        // display results
        System.out.println("Union:");
        for (Integer numbers : union) {
            System.out.println(numbers);
        }

        // Find Intersection
        Set<Integer> intersection = new HashSet<>(setOne);
        intersection.retainAll(setTwo);

        // display results
        System.out.println("\nIntersection:");
        for (Integer numbers : intersection) {
            System.out.println(numbers);
        }

        // Find difference
        Set<Integer> difference = new HashSet<>(setOne);
        difference.removeAll(setTwo);

        // display results
        System.out.println("\nDifference: ");
        for (Integer numbers : difference) {
            System.out.println(numbers);
        }
    }
}
