package Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Abdul", 154, 50000);

        System.out.println("Name: " + employee.getName());

        System.out.println("ID: " + employee.getId());

        System.out.printf("Salary: %.2f%n", employee.getSalary());

        employee.increaseSalary(50);

        System.out.println("Salary increased to: " + employee.getSalary());
    }
}
