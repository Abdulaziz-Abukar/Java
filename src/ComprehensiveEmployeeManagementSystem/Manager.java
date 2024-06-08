package ComprehensiveEmployeeManagementSystem;

public class Manager extends Employee{
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void work() {
        System.out.println(name + " is working..");
    }
}
