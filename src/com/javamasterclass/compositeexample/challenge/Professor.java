package com.javamasterclass.compositeexample.challenge;

public record Professor(String mName, String mPosition, int officeNumber) implements Faculty {
    @Override
    public String getDetails() {
        return (mName + " is the " + mPosition);
    }
}
