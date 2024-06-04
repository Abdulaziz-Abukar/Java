package SchoolManagementSystem;

import java.util.ArrayList;
public class Class {
    private String className;

    ArrayList<Student> students;

    public Class(String className) {
        this.className = className;

        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " has been added to: " + className);
        System.out.println();
    }

    public void removeStudent(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentID)) {
                System.out.println(students.get(i).getName() + " has been removed from " + className);
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found in the class " + className);
    }

    public String getClassName() {
        return className;
    }

    public void listStudents() {
        System.out.println();
        System.out.println(className);
        System.out.println();
        for (Student student : students) {
            student.displayinfo();
            System.out.println();
        }
    }
}
