package com.javamasterclass.stateexample.challenge;

public class AlertStateContext {
    private MobileAlertSate currentState;

    public AlertStateContext() {
        currentState = new Vibration(); // default state
    }
    public void setState(MobileAlertSate state){
        currentState = state;
    }
    public void alert(){
        currentState.alert();
    }
}
