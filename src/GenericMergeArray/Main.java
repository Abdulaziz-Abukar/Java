package GenericMergeArray;
import java.util.*;
public class Main {
    // Generic method to merge two arrays into one
    public static <T, I> Object[] mergeArray(T[] arrayOne, I[] arrayTwo) {
        if ((arrayOne == null || arrayOne.length == 0) && (arrayTwo == null || arrayTwo.length == 0)) {
            throw new IllegalArgumentException("Error, both arrays can't be empty.");
        }

        // Use a list to dynamically merge the arrays
        List<Object> mergedList = new ArrayList<>();

        // Add elements from the first array
        if (arrayOne != null) {
            for (T element : arrayOne) {
                mergedList.add(element);
            }
        }

        // Add elements from the second array
        if (arrayTwo != null) {
            for (I element : arrayTwo) {
                mergedList.add(element);
            }
        }

        // Convert the list back to an array
        return mergedList.toArray();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};

        // Merge the arrays
        Object[] myArray = mergeArray(intArray, strArray);

        // Print the merged array
        for (Object element : myArray) {
            System.out.print(element + " ");
        }
    }
}
