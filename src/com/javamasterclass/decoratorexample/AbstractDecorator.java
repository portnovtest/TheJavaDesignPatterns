package com.javamasterclass.decoratorexample;

public abstract class AbstractDecorator extends Component {
    protected Component com;

    void setTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}
