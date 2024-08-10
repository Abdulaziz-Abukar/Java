package CollectionsAndGenericsMaps;
import java.util.HashMap;
import java.util.Map;

/*
Map: An object that maps keys to values; no duplicate keys allowed

put() - Adds a key-value pair to the map
get() - Retrieves a value by its key
remove() - Removes a key-value pair by its key
entrySet() - Returns a set of key-value pairs
 */

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        // Adding key-value pairs
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");

        // Accessing values
        System.out.println("Student with ID 2: " + studentMap.get(2));

        // Iterating over key-value pairs
        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Removing a key-value pair
        studentMap.remove(3);

        // Checking size
        System.out.println("Number Of Students: " + studentMap.size());
    }
}
