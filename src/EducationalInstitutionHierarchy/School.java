/*
Exercise 3: Educational Institution Hierarchy
Description:
Create a class hierarchy for an educational institution.

Person Class:
Fields: name (String), age (int)
Methods: displayInfo() (void)

Student Class (inherits from Person):
Fields: studentID (String), major (String)
Methods: study() (void)

Teacher Class (inherits from Person):
Fields: employeeID (String), subject (String)
Methods: teach() (void)

GraduateStudent Class (inherits from Student):
Fields: thesisTitle (String)
Methods: research() (void)

Principal Class (inherits from Teacher):
Fields: yearsOfExperience (int)
Methods: manageSchool() (void)

Implement the class hierarchy.
Create instances of GraduateStudent and Principal, and demonstrate the use of their methods.
 */

package EducationalInstitutionHierarchy;

import javax.print.attribute.standard.PrinterInfo;

public class School {
    public static void main(String[] args) {
        GraduateStudent graduateStudent = new GraduateStudent();
        Principal principal = new Principal();

        principal.name = "Ted";
        principal.age = 46;
        principal.employeeID = "19535";
        principal.subject = "Management";
        principal.yearsOfExperience = 15;

        graduateStudent.thesisTitle = "idk";
        graduateStudent.major = "History";
        graduateStudent.studentId = "5151";
        graduateStudent.name = "Nigel";
        graduateStudent.age = 24;

        graduateStudent.displayInfo();
        graduateStudent.study();
        graduateStudent.research();

        System.out.println();
        System.out.println();

        principal.displayInfo();
        principal.teach();
        principal.manageSchool();
    }
}
