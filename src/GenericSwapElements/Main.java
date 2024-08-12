package GenericSwapElements;

public class Main {

    // Generic method to swap elements at two indices in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        // Check if indices are within bounds
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Swap elements at the specified indices
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap (Integer): ");
        printArray(intArray);

        swap(intArray, 1, 3); // Swap elements at index 1 and 3

        System.out.println("After swap (Integer): ");
        printArray(intArray);

        // Example with String array
        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("\nBefore swap (String): ");
        printArray(strArray);

        swap(strArray, 0, 4); // Swap elements at index 0 and 4

        System.out.println("After swap (String): ");
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
