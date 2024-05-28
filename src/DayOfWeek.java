import java.util.Scanner; // Import library for user input

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.println("Let's find out what day of the week it is!");

        // Loop to ensure valid input
        while (true) {
            System.out.print("Please provide a number from 1 to 7: ");
            int user_input = input.nextInt();

            // Validate input
            if (user_input < 1 || user_input > 7) {
                System.out.println("Please provide a number between 1 and 7...");
                continue; // Prompt again if input is invalid
            }

            // Determine the day of the week
            switch (user_input) {
                case 1:
                    System.out.println("1 is Monday");
                    break;
                case 2:
                    System.out.println("2 is Tuesday");
                    break;
                case 3:
                    System.out.println("3 is Wednesday");
                    break;
                case 4:
                    System.out.println("4 is Thursday");
                    break;
                case 5:
                    System.out.println("5 is Friday");
                    break;
                case 6:
                    System.out.println("6 is Saturday");
                    break;
                case 7:
                    System.out.println("7 is Sunday");
                    break;
            }
            break; // Exit the loop after valid input
        }

        // Close the Scanner object
        input.close();
    }
}
