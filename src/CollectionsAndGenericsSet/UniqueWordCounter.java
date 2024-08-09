package CollectionsAndGenericsSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class UniqueWordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create a set
        Set<String> uniqueWords = new HashSet<>();

        // Grab user input
        System.out.print("Please write a paragraph: ");
        String userInput = input.nextLine();

        // Split the input into words using a regex

        String[] words = userInput.split("\\W+");

        // Add them into the Set
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word.toLowerCase());
            }
        }

        // Print the unique words
        System.out.println(uniqueWords);

        // Close the Scanner
        input.close();
    }
}
