package FILE_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendingToFile {
    public static void main(String[] args) {
        String file = "src/FILE_IO/output_text";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("New Line");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
