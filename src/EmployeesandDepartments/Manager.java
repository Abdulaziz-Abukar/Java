package EmployeesandDepartments;

public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is working..");
    }
}
