package com.javamasterclass.interfacesegregationexample;

// Fat interface -> needs to be separated
interface RestaurantInterface {
    void acceptOnlineOrder();

    void takeTelephoneOrder();

    void payOnline();

    void walkInCustomerOrder();

    void payInPerson();
}

class OnlineClientImpl implements RestaurantInterface {

    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {

    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {

    }

    @Override
    public void payInPerson() {

    }
}

public class Restaurant {
}
