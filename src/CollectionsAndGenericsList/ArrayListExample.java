package CollectionsAndGenericsList;
import java.util.ArrayList;
import java.util.List;

/*
List: an ordered collection that allows duplicate elements.

methods:

add() - adds an element to the list
get() - retrieves an element by index
remove() - removes an element from the list
size() - returns the number of elements in the list
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();


        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");


        // Accessing elements
        System.out.println("First Fruit: " + fruits.get(0));


        // Iterating over elements
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing elements
        fruits.remove("Banana");

        // Checking size
        System.out.println("Number of fruits: " + fruits.size());
    }
}
