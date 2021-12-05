package com.javamasterclass.compositeexample.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private final String name;
    private final String dptName;
    private final List<Faculty> myFacultyList;

    public Supervisor(String name, String dptName) {
        this.name = name;
        this.dptName = dptName;
        myFacultyList = new ArrayList<>();
    }

    public void add(Faculty professor) {
        myFacultyList.add(professor);
    }

    public void remove(Faculty professor) {
        myFacultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return myFacultyList;
    }

    @Override
    public String getDetails() {
        return name + " is the " + dptName;
    }
}
