package OOPStudents;

public class Main {
    public static void main(String[] args) {

        Students aesha_mumtaz = new Students("Aesha Mumtaz", 52567, "A+", 96 );

        aesha_mumtaz.displayInfo();
        System.out.println();
        System.out.println();
        aesha_mumtaz.updateGrade(65, "C");

        aesha_mumtaz.displayInfo();
    }
}
