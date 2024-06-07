package EducationalInstitutionHierarchy;

public class Teacher extends Person{
    String employeeID;
    String subject;

    void teach() {
        System.out.println(name + " is teaching..");
    }
}