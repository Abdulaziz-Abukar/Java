package StudentGradeCalculator;
import java.util.List;
import java.util.ArrayList;
public class Student {
    private String name;
    private List<Double> grades;


    public Student(String name) {
        this.name  = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void displayGrades() {
        for (double studentGrades : grades) {
            System.out.println("Grade: " + studentGrades);
        }
    }

    public double averageGrades() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public List<Double> getGrades() {
        return grades;
    }
}
