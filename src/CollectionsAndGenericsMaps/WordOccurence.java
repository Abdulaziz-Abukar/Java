package CollectionsAndGenericsMaps;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Exercise 3: Word Occurrence in a Text
Objective:
Create a program that reads a block of text from a file and counts the occurrence of each word using a HashMap.

Instructions:

Use a HashMap<String, Integer> to store each word and its occurrence.
Read text from a file and update the map for each word.
Print the occurrence of each word.
 */
public class WordOccurence {
    public static void main(String[] args) {
        Map<String, Integer> wordCounter = new HashMap<>();
        String file = "src/CollectionsAndGenericsMaps/textfile";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word: words) {
                    if (!word.equals(" ")) {
                        wordCounter.put(word.toLowerCase(), wordCounter.getOrDefault(word, 0) + 1);
                    }

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
