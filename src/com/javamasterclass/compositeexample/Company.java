package com.javamasterclass.compositeexample;

public class Company {
    public static void main(String[] args) {
        var dev1 = new Developer(100, "Phil", "Pro Developer");
        var dev2 = new Developer(101, "Josh", "Entry level Developer");
        var engineeringDirectory = new Directory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        var manager1 = new Manager(200, "Joe Blow", "SEO Manager");
        var manager2 = new Manager(201, "Sergey Feeding", "Josh's Manager");

        var accDirectory = new Directory();
        accDirectory.addEmployee(manager1);
        accDirectory.addEmployee(manager2);

        var companyDirectory = new Directory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
