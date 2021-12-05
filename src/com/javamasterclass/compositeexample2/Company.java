package com.javamasterclass.compositeexample2;

public class Company {
    public static void main(String[] args) {
        var dev1 = new Developer(100, "Phil", "Pro Developer");
        var dev2 = new Developer(101, "Josh", "Entry level Developer");
        var engManager = new Manager("Mike", 25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        var dev3 = new Developer(102, "Tom", "Developer");
        var generalManager = new Manager("Mark", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}
