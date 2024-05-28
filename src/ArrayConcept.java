import java.util.Scanner;

public class ArrayConcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Create an array to store 5 numbers

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Store each number input by the user
        }

        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number); // Print each number
        }
    }
}
