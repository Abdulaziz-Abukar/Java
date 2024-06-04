package SchoolManagementSystem;
import java.util.ArrayList;
public class School {
    private String schoolName;
    ArrayList<Class> classes;

    public School(String schoolName) {
        this.schoolName = schoolName;
        classes = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addClass(Class classObj) {
        classes.add(classObj);
        System.out.println(classObj + " has been added to " + schoolName);
    }

    public void removeClass(String className) {
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).getClassName().equals(className)) {
                System.out.println("Class: " + className + " Has been removed.");
                classes.remove(i);
                return;
            }
        }
        System.out.println(className + " Has not been found at this school.");
    }

    public void listClasses() {
        System.out.println("School: " + schoolName);
        for (Class classObj: classes) {
            System.out.println("- " + classObj.getClassName());
        }
    }
}
