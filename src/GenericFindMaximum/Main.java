package GenericFindMaximum;
/*
Exercise 2: Find Maximum
Objective:
Create a generic method findMax that finds the maximum element in an array of Comparable objects.

Requirements:

The method should take an array of any type that implements the Comparable interface.
Return the maximum element.
 */
public class Main {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Error, Array can't be empty.");
        }

        T max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"dog", "cat", "mouse", "monkey"};

        Integer maxInt = findMax(intArray);
        System.out.println(maxInt);

        String maxString = findMax(stringArray);
        System.out.println(maxString);
    }
}
