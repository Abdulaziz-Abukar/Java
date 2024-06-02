package BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("54594049", 100);

        System.out.println("Account Number: " + bankAccount.getAccountNumber());

        bankAccount.deposit(100);

        System.out.println("Balance : " + bankAccount.balance);
        bankAccount.withdraw(50);


    }
}
