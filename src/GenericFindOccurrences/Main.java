package GenericFindOccurrences;

public class Main {
    public static <T, F> int finder(T[] array, F item) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array can't be empty.");
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 1, 2, 4, 5, 6, 1, 2, 4, 3, 4, 5};
        int wordOccurrence = finder(intArray, 1);

        String[] stringArray = {"monkey", "dog", "monkey", "cat", "monkey"};
        int stringWordOccurrence = finder(stringArray, "monkey");


        System.out.println("1 occurs: " + wordOccurrence + " times.");
        System.out.println("monkey occurs: " + stringWordOccurrence + " times.");
    }
}
