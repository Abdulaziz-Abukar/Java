package CollectionsAndGenericsSet;
import java.util.HashSet;
import java.util.Set;

/*
Set: A collection that does not allow duplicate elements

The 'Set' interface is implemented by classes like 'HashSet' and 'TreeSet'
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        // adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // duplicate element

        // Iterating over elements
        System.out.println("All colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Checking size
        System.out.println("Number of colors: " + colors.size());
    }
}
