package UniversityProj;

import package2.C;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Aesha", 123);

        // Create some courses
        Course math = new Course(
                "Mathematics", "MATH101", 3
        );
        Course science = new Course
                (
                        "Science", "SCI101", 4
                );

        student.enroll(math);
        student.enroll(science);

        for (Course course : student.getCourses()) {
            System.out.println(course.getCourseName());
        }

        student.drop(math);

        System.out.println();
        System.out.println();

        for (Course course : student.getCourses()) {
            System.out.println(course.getCourseName());
        }
    }

}
