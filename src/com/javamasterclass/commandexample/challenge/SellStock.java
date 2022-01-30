package com.javamasterclass.commandexample.challenge;

public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock) {
        myStock = someStock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}
