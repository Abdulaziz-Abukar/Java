package Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator calculator = new Calculator();
        System.out.println("Welcome to the calculator simulator\n");

        while (true) {
            System.out.print(
                    "Type an operation or QUIT to exit program (+, -, x, /): ");
            String operationInput = input.next();

            if (operationInput.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.print("First number: ");
            int numOne = input.nextInt();

            System.out.print("Second number: ");
            int numTwo = input.nextInt();

            switch (operationInput) {
                case "+" :
                    System.out.println(numOne + " + " + numTwo + " = " + calculator.add(numOne, numTwo));
                    break;

                case "-":
                    System.out.println(numOne + " - " + numTwo + " = " + calculator.subtract(numOne, numTwo));
                    break;

                case "x":
                    System.out.println(numOne + " x " + numTwo + " = " + calculator.multiply(numOne, numTwo));
                    break;

                case "/":
                    System.out.println(numOne + " / " + numTwo + " = " + calculator.divide(numOne, numTwo));
                    break;

                default:
                        throw new IllegalStateException("Unexpected value: " + operationInput);
            }
        }
    }
}
