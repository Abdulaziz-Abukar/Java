package StudentGradeCalculator;

public class Main {
    public static void main(String[] args) {
        // Create a Student Object
        Student student1 = new Student("Abdulaziz");
        // Create a GradeCalculator Object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Input grades for the student
        gradeCalculator.inputGrades(student1);
        // Display grades for student
        student1.displayGrades();
        double average = student1.averageGrades();
        System.out.println(String.format("Average grade for %s: %.2f", student1.getName(), average));

        // save grades to a file
        gradeCalculator.saveGradesToFile(student1, "src/StudentGradeCalculator/gradeFile");

        // read grades from a file

        gradeCalculator.readGradesFromFile("src/StudentGradeCalculator/gradeFile");
    }
}
