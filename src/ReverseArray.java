import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Adjust the size as needed

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Code to reverse the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        // Hint: You might want to loop through the array in reverse, or swap elements

        System.out.println("Array in reverse order:");
        for(int number: numbers){
            System.out.println(number);
        }
        scanner.close(); // Remember to close the Scanner
    }
}
