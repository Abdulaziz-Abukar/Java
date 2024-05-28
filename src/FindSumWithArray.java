/*
Find the Sum: Write a program to find the sum of all elements in an array.
 */

public class FindSumWithArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbersArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
