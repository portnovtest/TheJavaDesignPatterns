package com.javamasterclass.observerexample;

public class MyTopicSubscriber implements Observer {
    private final String name;

    // not required, could just pass subjects state to update method, but , also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // this method could take data of subjects state that was changed, do not need to ask top
        var msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        // not required, added so observer can ask subject for state
        this.topic = sub;
    }
}
