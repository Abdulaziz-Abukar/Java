package UniversityProj;

public class Course {
    // Fields
    private String courseName;
    private String courseCode;
    private int credits;

    // Constructor
    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    // Setter for courseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    // Getter for credits
    public int getCredits() {
        return credits;
    }

    // Setter for credits
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
