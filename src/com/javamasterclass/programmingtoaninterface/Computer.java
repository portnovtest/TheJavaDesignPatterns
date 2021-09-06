package com.javamasterclass.programmingtoaninterface;

class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through " + this.getClass().getSimpleName().toLowerCase());
    }
}
class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through " + this.getClass().getSimpleName().toLowerCase());
    }
}
public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }
    public void display(){
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm1 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }
}
