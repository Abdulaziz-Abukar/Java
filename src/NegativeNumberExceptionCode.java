import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


public class NegativeNumberExceptionCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            while(true) {
                System.out.print("Please provide a number or type quit to exit: ");
                String userInput = input.nextLine();

                if (userInput.equalsIgnoreCase("Quit")) {
                    break;
                }
                int number = Integer.parseInt(userInput);
                checkNumber(number);
            }
        } catch (NegativeNumberException e) {
            System.out.println("Invalid number, must be positive.");
        } finally {
            input.close();
        }
    }

    static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number must be a positive number.");
        }
        else {
            System.out.println("Valid number");
        }
    }
}
