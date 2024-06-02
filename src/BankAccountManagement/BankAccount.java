package BankAccountManagement;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
public class BankAccount {
    // Fields
    private int accountNumber;
    private double balance;
    private String accountHolder;

    private static Set<Integer> usedAccountNumbers = new HashSet<>();

    // Constructor
    public BankAccount(double balance, String accountHolder) {
        this.accountNumber = generateUniqueAccountNumber();
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    private int generateUniqueAccountNumber() {
        Random random = new Random();
        int accountNumber;
        do {
            accountNumber = 10000 + random.nextInt(90000); // Generates a number between 10000 and 99999
        } while (usedAccountNumbers.contains(accountNumber));
        usedAccountNumbers.add(accountNumber);
        return accountNumber;
    }

    public void displayAccountinfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Holder: " + accountHolder);
    }

    // Deposit Method
    public double deposit(double amount) {
        if (amount > 0) {
            System.out.println("$" + amount + " deposited.");
            balance+=amount;
            System.out.println("New Balance is: $" + balance);
        }
        else {
            System.out.println("You cannot deposit $" + amount );
        }
        return amount;
    }

    // Withdraw Method
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough funds to withdraw.");
        }
        else if (amount <= 0) {
            System.out.println("you cannot withdraw $" + amount);
        }
        else {
            System.out.println("$" + amount + " withdrawn.");
            balance -= amount;
            System.out.println("New Balance is: $" + balance);
        }
        return amount;
    }
}
