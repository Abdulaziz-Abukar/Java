/*
1. Reading from a File

To read from a file in Java, you typically use `FileRead` and `BufferedReader` classes.

`FileReader` Reads character files.

`BufferedReader` Reads text from an input stream and buffers characters for efficient reading.
 */

package FILE_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadExample {
    public static void main(String[] args) {
        // Try-with-resources to ensure the BufferedReader is closed automatically
        String fileLocation = "src/FILE_IO/example.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading this file: " + e.getMessage());
        }
    }
}


/*
`FileReader` Opens a file for reading

`BufferedReader` Wraps the `FileReader` to read text efficiently

`readLine()` Reads a line of text from the file.

`try-with-resources` Ensures the `BufferedReader` is closed automatically
 */