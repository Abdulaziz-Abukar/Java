/*
Calculate Average: Calculate the average value of array elements.
 */

public class CalculateAverageInArray {
    public static void main(String[] args) {
        int[] numbersArray = {10, 20, 50, 40, 50};
        double sum = 0; // Use double to hold the sum to avoid integer division
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i]; // Accumulate the sum of all array elements
        }
        double average = sum / numbersArray.length; // Calculate the average
        System.out.println("The average is: " + average);
    }
}
