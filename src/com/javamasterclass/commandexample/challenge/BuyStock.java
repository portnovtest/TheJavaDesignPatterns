package com.javamasterclass.commandexample.challenge;

public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock someStock) {
        myStock = someStock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}
