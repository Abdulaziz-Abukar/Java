package GenericReverseArray;
import java.util.*;
public class Main {
    // Generic method to reverse an array
    public static <T> void reverseArray(T[] array) {
        if (array == null || array.length <= 1) {
            return; // No need to reverse if the array is null or has 0 or 1 elements
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry", "date"};

        System.out.println("Original Integer Array: ");
        printArray(intArray);

        reverseArray(intArray);
        System.out.println("Reversed Integer Array: ");
        printArray(intArray);

        System.out.println("\nOriginal String Array: ");
        printArray(strArray);

        reverseArray(strArray);
        System.out.println("Reversed String Array: ");
        printArray(strArray);

    }

    // Utility method to print an array
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
