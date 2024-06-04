package SchoolManagementSystem;

public class Student {
    private String name;
    private String studentId;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("StudentID: " + studentId);
    }
}

