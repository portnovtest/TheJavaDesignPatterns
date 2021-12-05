package com.javamasterclass.compositeexample;

public record Manager(long epId, String name, String position) implements Employee {

    @Override
    public void showEmployeeDetails() {
        System.out.printf("%d %s %s\n", epId, name, position);
    }
}
