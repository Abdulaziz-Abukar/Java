/*
Count Even Numbers: Count the number of even numbers in an array.
 */
import java.util.Scanner;
public class CountEvenNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("There are: " + count + " even numbers.");
        input.close();
    }
}
