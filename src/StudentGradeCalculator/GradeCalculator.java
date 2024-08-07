package StudentGradeCalculator;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class GradeCalculator {

    public void inputGrades(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades for " + student.getName() + ". type -1 to finish");

        while (true) {
            System.out.print("Enter grade: ");
            String input = scanner.nextLine();

            try {
                double grade = Double.parseDouble(input);

                // check if the user wants to stop entering grades
                if (grade == -1) {
                    break;
                }

                if (grade < 0 || grade > 100) {
                    System.out.println("Please enter a grade between 0 and 100.");
                } else {
                    student.addGrade(grade);
                    System.out.println("Grade Added.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    public void saveGradesToFile(Student student, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Grades for " + student.getName() + ":\n");
            for (double grade : student.getGrades()) {
                writer.write(String.format("%.2f", grade) + "\n");
            }
            double average = student.averageGrades();
            writer.write("Average: " + String.format("%.2f", average) + "\n");
            System.out.println("Grades and average saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    // Method to read grades and average from a file
    public void readGradesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
