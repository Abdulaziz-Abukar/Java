package CollectionsAndGenericsList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class FindingMaximumAndMinimum {
    public static void main(String[] args) {

        // Create the list
        List<Integer> numbers = new ArrayList<>();

        // add random numbers

        for (int i = 0; i <= 100; i++) {
            int randomNum = (int)(Math.random() * 500);
            numbers.add(randomNum);
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Min: " + min + ", Max: " + max);

    }

}
