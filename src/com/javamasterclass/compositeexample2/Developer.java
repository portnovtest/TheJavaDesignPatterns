package com.javamasterclass.compositeexample2;

public record Developer(long epId, String name, String position) implements Employee {

    @Override
    public void showEmployeeDetails() {
        System.out.printf("%d %s %s\n", epId, name, position);
    }
}
