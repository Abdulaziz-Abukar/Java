/*
Check for a Specific Value: Write a method that checks whether a certain value is present in an array.
 */

public class ValueFinderArray {
    public static void main(String[] args) {
        String[] myArray = {"Zed", "Viego", "Veigar", "Yasuo", "Jax", "Shen"};
        boolean found = false; // Flag to indicate if the value is found

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals("Zed")) {
                found = true; // Set found to true if "Zed" is found
                break; // Exit the loop since we found the value
            }
        }

        if (found) {
            System.out.println("Found it");
        } else {
            System.out.println("Did not find it");
        }
    }
}

