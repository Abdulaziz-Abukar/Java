package ComprehensiveEmployeeManagementSystem;
import java.util.ArrayList;
public class EmployeeManager {
    ArrayList<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    // add employees
    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    // display all employees
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.name);
        }
    }

    // calculate total salary of all employees.
    public double totalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employees.isEmpty()) {
                return 0;
            }
            total += employee.salary;
        }
        return total;
    }
}
