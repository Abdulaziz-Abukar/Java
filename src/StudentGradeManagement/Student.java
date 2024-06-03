package StudentGradeManagement;
import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}
