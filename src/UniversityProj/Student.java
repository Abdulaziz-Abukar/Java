package UniversityProj;
import java.util.ArrayList; // import Arraylists

public class Student {
    // Fields
    String name;
    int id;
    ArrayList<Course> courses;


    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>(); // Initialize the course Arraylist.
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Getter for student ID.
    public int getId() {
        return id;
    }

    // Enroll into course, gets added to Arraylist.
    public void enroll(Course course) {
        courses.add(course);
    }

    // Drop from course, removed from ArrayList.
    public void drop(Course course) {
        courses.remove(course);
    }

    // Prints list of courses.
    public ArrayList<Course> getCourses() {
        return courses;
    }
}


