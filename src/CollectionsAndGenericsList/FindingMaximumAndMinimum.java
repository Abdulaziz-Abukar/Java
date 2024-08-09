package CollectionsAndGenericsList;
import java.util.List;
import java.util.ArrayList;
public class FindingMaximumAndMinimum {
    public static void main(String[] args) {

        // Create the list
        List<Integer> numbers = new ArrayList<>();

        // add the numbers
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(19);
        numbers.add(12);
        numbers.add(20);
        numbers.add(26);
        numbers.add(12);

        int findingMin = FindingMinNum(numbers);

        System.out.println("Min number is: " + findingMin);

    }
    static int FindingMinNum(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        int min = list.get(0); // Assume first element is the minimum

        for (int num : list) {
            if(num < min) {
                min = num; // Update min if a smaller number is found
            }
        }
        return min;
    }

}
