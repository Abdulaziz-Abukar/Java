package CollectionsAndGenericsList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class ListOfStrings {
    public static void main(String[] args) {

        // create the list
        List<String> myStringList = new ArrayList<>();


        // Add words
        myStringList.add("Craig");
        myStringList.add("Jenn");
        myStringList.add("Daniel");
        myStringList.add("Bobby");
        myStringList.add("Aliyah");

        // printing unsorted list
        System.out.println("List of unsorted words:");
        for (String words : myStringList) {
            System.out.println(words);
        }

        // Sort the list
         Collections.sort(myStringList);


         // Print sorted results
        System.out.println("List of sorted words:");
         for (String words : myStringList) {
             System.out.println(words);
         }
    }
}
