package StudentGradeManagement;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("AeshaMumtaz", "164750");

        student1.addGrade(70);
        student1.addGrade(89);
        student1.addGrade(100);
        student1.addGrade(50);

        student1.displayStudentInfo();
    }

}
