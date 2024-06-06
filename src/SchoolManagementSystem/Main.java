package SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {

        School school1 = new School("Forest Lawn");
        Student student1 = new Student("Abdulaziz", "ST1");
        Student student2 = new Student("Antonio", "ST2");
        Class class1 = new Class("Math");

        school1.addClass(class1);

        class1.addStudent(student1);

        class1.addStudent(student2);

        school1.listClasses();

        school1.removeClass(class1.getClassName());
    }
}
