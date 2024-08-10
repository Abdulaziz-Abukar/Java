package CollectionsAndGenericsMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyCounter {
    public static void main(String[] args) {
        // Prompt the user to input a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use a HashMap<Character, Integer> to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over the string to update the map
        for (char ch : input.toCharArray()) {
            // Ignore spaces (optional)
            if (ch != ' ') {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the frequency of each character
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
