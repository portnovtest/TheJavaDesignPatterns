package com.javamasterclass.compositeexample2;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private final String name;
    private final double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private final List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        System.out.printf("""
                --------------
                Name : %s,
                Salary : %.2f
                --------------
                """, getName(), getSalary());
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
