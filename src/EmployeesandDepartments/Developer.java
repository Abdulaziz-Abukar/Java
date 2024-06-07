package EmployeesandDepartments;

import ElectronicsHierarchy.Device;

public class Developer extends Employee{

    public Developer(String name) {
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + " is working");
    }
}
