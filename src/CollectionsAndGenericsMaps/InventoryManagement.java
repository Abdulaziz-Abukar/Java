package CollectionsAndGenericsMaps;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
/*
Exercise 5: Inventory Management
Objective:
Create an inventory management system for a store using a HashMap.

Instructions:

Use a HashMap<String, Integer> where the key is the product name and the value is the quantity in stock.
Provide options to:
Add a product and its quantity.
Remove a product.
Update the quantity of a product.
Display all products and their quantities.
Check the quantity of a specific product by name.
 */

public class InventoryManagement {
    private static Map<String, Integer> inventory = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to my inventory management system\n");

        while (!exit) {
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update quantity of product");
            System.out.println("4. Display all products");
            System.out.println("5. Check quantity of product");
            System.out.println("6. Exit");

            System.out.print("\nPlease enter a number: ");
            int choice = input.nextInt();
            input.nextLine(); // clear the newline character

            switch (choice) {
                case 1:
                    addProduct(input);
                    break;
                case 2:
                    removeProduct(input);
                    break;

                case 3:
                    updateQuantity(input);
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    checkQuantity(input);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }

    // method for adding product
    public static void addProduct(Scanner input) {
        System.out.print("\n Please give me the name of a product: ");
        String product = input.nextLine().trim().toLowerCase();
        if (inventory.containsKey(product)) {
            System.out.println("\n" + product + " is already in the system.\n");
            return;
        }

        String regex = "^[a-zA-Z]+$";
        if (!Pattern.matches(regex, product)) {
            System.out.println("Please provide a valid name.");
            return;
        }

        System.out.print("\n Please provide a quantity for this product: ");
        try {
            int quantity = input.nextInt();
            input.nextLine(); // clear the newline character
            inventory.put(product, quantity);
            System.out.println( "\n" + quantity + " of " + product + " have been added.\n");
        } catch (InputMismatchException e) {
            input.nextLine(); // clear the invalid input.
            System.out.println("\nPlease provide a valid number.\n");
        }

    }

    // method for removing product
    public static void removeProduct(Scanner input) {
        System.out.print("\n Please provide the name of the product: ");
        String product = input.nextLine().trim();
        if (!inventory.containsKey(product)) {
            System.out.println("\nSorry, but " + product + " is not in our system.\n");
            return;
        }
        inventory.remove(product);
        System.out.println("\n" + product + " has been removed.\n");
    }

    // Method for updating quantity of a product
    public static void updateQuantity(Scanner input) {
        System.out.print("\nPlease provide the name of the product: ");
        String product = input.nextLine().trim().toLowerCase();

        if (!inventory.containsKey(product)) {
            System.out.println("\nSorry, but " + product + " is not in the system.\n");
            return;
        }

        int currentQuantity = inventory.get(product);

        try {
            System.out.print("\nPlease provide the amount you wish to add or subtract: ");
            int change = input.nextInt();
            input.nextLine(); // clear newline character

            int newQuantity = currentQuantity + change;

            if (newQuantity < 0) {
                System.out.println("\nQuantity cannot be negative. Operation cancelled.\n");
                return;
            }

            inventory.put(product, newQuantity);
            System.out.println("\nThe new amount of " + product + " is: " + newQuantity + "\n");
        } catch (InputMismatchException e) {
            input.nextLine(); // clear invalid input
            System.out.println("\nPlease provide a valid number.\n");
        }
    }



    // method for displaying all products
    public static void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("\n Sorry, the inventory is empty.\n");
        } else {
            System.out.println();
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
            }
        }
        System.out.println();
    }

    // method for checking quantity of product
    public static void checkQuantity(Scanner input) {
        System.out.print("\n Please provide the product name: ");
        String product = input.nextLine().trim().toLowerCase();
        if (inventory.containsKey(product)) {
            System.out.println("\n" + product + ": " + inventory.get(product) + "\n");
        } else {
            System.out.println("\nThe product is not in the system.\n");
        }
    }
}
