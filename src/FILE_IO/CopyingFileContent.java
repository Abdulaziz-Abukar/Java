package FILE_IO;

import java.io.*;

public class CopyingFileContent {
    public static void main(String[] args) {
        String file = "src/FILE_IO/source";
        String destinationFile = "src/FILE_IO/destination";
        copyFile(file, destinationFile);
    }

    public static void copyFile(String sourceFile, String destinationFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}

