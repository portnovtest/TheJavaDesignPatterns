package com.javamasterclass.iteratorexample.challenge;

import java.util.LinkedList;

public class Science implements SubjectInterface {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
