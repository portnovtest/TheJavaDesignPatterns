package com.javamasterclass.adapterclassinheritanceexample;

public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
