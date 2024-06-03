package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
                52817, "Dude",
                "Accountant", 75000
        );

        employee1.displayInfo();

        employee1.increaseSalary(100);

        employee1.displayInfo();
    }
}
