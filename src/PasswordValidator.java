/*
Password Validator:
Implement a password validation system where the user is prompted to enter a password until it meets a certain condition
(e.g., at least 8 characters long). Use a do-while loop to keep asking for input until the condition is met.
 */

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.print("Please enter a password: ");
            password = input.nextLine();
            if (password.length() < 8) {
                System.out.println("Password too short. Please enter a password that is at least 8 characters long.");
            }
        } while (password.length() < 8);

        System.out.println("Password accepted. Welcome back!");
    }
}
