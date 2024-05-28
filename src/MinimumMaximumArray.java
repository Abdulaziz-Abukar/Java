/*
Find the Minimum/Maximum: Find the minimum and maximum element in an array.
 */
import java.lang.Math;
public class MinimumMaximumArray {
    public static void main(String[] args) {
        // Initialize minimum and maximum with the first element of the array
        int[] myArray = {2, 4, 6, 1, 9, 5};
        int minimum = myArray[0];
        int maximum = myArray[0];

        // Loop through the array starting from the first index
        for (int i = 1; i < myArray.length; i++) {
            // If the current element is smaller than the minimum, update minimum
            if (myArray[i] < minimum) {
                minimum = myArray[i];
            }
            // If the current element is larger than the maximum, update maximum
            if (myArray[i] > maximum) {
                maximum = myArray[i];
            }
        }
        // Print the results
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
    }
}
