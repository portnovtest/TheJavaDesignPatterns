package com.javamasterclass.iteratorexample.challenge;

public class Arts implements SubjectInterface {
    private String[] subjects;

    public Arts() {
        subjects = new String[]{"Bengali", "English"};
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
