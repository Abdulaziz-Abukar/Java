package BankAccountManagement;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the new and improved Bank of Canada!\n");

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("1. create a Bank Account");
            System.out.println("2. Display Information");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("Type Quit to exit.");

            int userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Please provide the holder's name: ");
                    String accountHolder = input.next();

                    System.out.print("Please provide an initial deposit amount: ");

                    double initialDeposit = input.nextDouble();
                    input.nextLine();   // consume the newline character;

                    BankAccount account = new BankAccount(initialDeposit, accountHolder);
                    accounts.add(account);
                    System.out.println("Account creation successful!\nHere are your details: ");
                    account.displayAccountinfo();
                    break;
                case 2:


            }
        }
    }
}
