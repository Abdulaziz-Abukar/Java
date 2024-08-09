package CollectionsAndGenericsList;
import java.util.ArrayList;
import java.util.List;
public class BasicListOperations {
    public static void main(String[] args) {
        // create the list
        List<Integer> numbers = new ArrayList<>();

        // add the numbers in the list

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Iterating over every element in list
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Remove the third element
        numbers.remove(2);

        // Print the list again
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
