package FILE_IO;
import java.io.*;

/*
To append a file (rather than overwrite it), you can use the `FileWriter` constructor that accepts a boolean indicating whether to append.
 */

public class AppendFileExample {
    public static void main(String[] args) {
        String file = "src/FILE_IO/example.txt";
        // Try-with-resources to ensure the BufferedWriter is closed automatically
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < 5; i++) {
                bw.write("Appending this line.");
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error appending to this file: " + e.getMessage());
        }
    }
}
