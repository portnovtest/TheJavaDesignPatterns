package com.javamasterclass.adapterclassinheritanceexample;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Class and Object Adapter Demo*** ");
        var classAdapter = new ClassAdapter();
        System.out.println("Class Adapter is returning : " + classAdapter.getInteger());

        var objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning : " + objectAdapter.getInteger());
    }
}
