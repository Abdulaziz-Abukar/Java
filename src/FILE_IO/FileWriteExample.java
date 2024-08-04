package FILE_IO;
import java.io.*;
/*
2. Writing to a File

To write to a file in Java, you typically use `FileWriter` and `BufferedWriter` classes.

`FileWriter: writes character files

`BufferedWriter`: writes text to an output stream and buffers characters for efficient writing
 */

public class FileWriteExample {
    public static void main(String[] args) {
        String file = "src/FILE_IO/example.txt";
        // Try-with-resources to ensure the BufferedWriter is closed automatically
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Hello World, from java writing execution!");
            bw.newLine();
            bw.write("Writing to a file in Java");
        } catch (IOException e) {
            System.out.println("Error writing to this file: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
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
`FileWriter`: opens a file for writing

`BufferedWriter`: Wraps the `FileWriter` to write text efficiently

`write(String s)`: writes a string to the file

`newLine()`: Writes a newline character to the file

`try-with-resources`: Ensures the `BufferedWriter` is closed automatically.
 */