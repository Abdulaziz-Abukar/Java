package FILE_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {
        String file = "src/FILE_IO/output_text";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Hello");
            bw.newLine();
            bw.write("World!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
