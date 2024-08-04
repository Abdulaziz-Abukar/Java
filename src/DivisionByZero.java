import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("first num: ");
            int num1 = input.nextInt();
            System.out.print("second num: ");
            int num2 = input.nextInt();

            System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("That's all!");
        }
        input.close();
    }



    static int division(int a, int b) {
        return a / b;
    }
}

