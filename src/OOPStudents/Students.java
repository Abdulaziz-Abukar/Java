package OOPStudents;


// Student Class
public class Students {
    // Attributes of this class (Fields)
    String name;
    int id;
    String letterGrade;
    int percentageGrade;


    // Constructor to initialize the fields
    public Students(String name, int id, String letterGrade, int percentageGrade) {
        this.name = name;
        this.id = id;
        this.letterGrade = letterGrade;
        this.percentageGrade = percentageGrade;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Letter Grade: " + this.letterGrade);
        System.out.println("percentageGrade: " + this.percentageGrade);
    }

    public void updateGrade(int percentageGrade, String letterGrade) {
        this.percentageGrade = percentageGrade;
        this.letterGrade = letterGrade;
    }
}
