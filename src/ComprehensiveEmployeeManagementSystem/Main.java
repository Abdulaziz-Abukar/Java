/*
2. Employee Management System

Exercise:

Create an employee management system with the following features:

Classes and Objects:

Create a superclass Employee with properties name and salary, and an abstract method work().
Create subclasses Developer and Manager that extend Employee and implement the work() method.
Add unique properties to each subclass, such as programmingLanguage for Developer and teamSize for Manager.

Control Flow and Loops:

Create an EmployeeManager class that maintains a list of Employee objects.
Implement methods to add employees, display all employees, and calculate the total salary of all employees.

Polymorphism:
Use polymorphism to handle different types of Employee objects in the EmployeeManager class.
Objective:

Instantiate objects of Developer and Manager, add them to the EmployeeManager, and demonstrate all functionalities.
 */

package ComprehensiveEmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        // New developer created
        Developer developer1 = new Developer("Abdul", 90000, "Java");
        Developer developer2 = new Developer("Aesha", 70000, "Python");
        // new manager created
        Manager manager1 = new Manager("Elias", 120000, 2);

        // stores all employees
        EmployeeManager employeeManager = new EmployeeManager();

        //adds all employees.
        employeeManager.addEmployees(developer1);
        employeeManager.addEmployees(developer2);
        employeeManager.addEmployees(manager1);

        // display all employees.
        employeeManager.displayEmployees();
        // prints total salary of all employees
        System.out.printf("Total Employee Salary: %.2f%n", employeeManager.totalSalary());
    }
}
