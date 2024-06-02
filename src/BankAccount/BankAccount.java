package BankAccount;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("No Funds Withdrawn.");
        } else if (amount > balance) {
            System.out.println("Not enough funds in account");
        }
        else {
            balance -= amount ;
            System.out.println(amount + " Taken out.\n New balance Total: " + balance);
        }
    }
}
