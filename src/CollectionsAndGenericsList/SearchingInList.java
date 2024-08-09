package CollectionsAndGenericsList;
import java.util.List;
import java.util.ArrayList;
public class SearchingInList {
    public static void main(String[] args) {
        // Create a list
        List<String> wordList = new ArrayList<>();

        // Add 7 random words
        wordList.add("Hello");
        wordList.add("This");
        wordList.add("Is");
        wordList.add("A");
        wordList.add("Java");
        wordList.add("Program");
        wordList.add("yes");


        // failed result should return nothing
        String failedResult = findWord(wordList, "Cat");


        // successful result should return word
        String successfulResult = findWord(wordList, "Program");

        System.out.println(failedResult);
        System.out.println(successfulResult);
    }

    // Method for searching
    static String findWord(List<String> list, String word) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty or null");
        }

        int count = 0;
        for (String words : list) {
            if (words.equalsIgnoreCase(word)) {
                return words + " Found at index: " + count;
            }
            count++;
        }
        return "Nothing found.";
    }
}
