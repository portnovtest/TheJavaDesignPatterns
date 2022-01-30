package com.javamasterclass.commandexample.challenge;

public class Client {
    public static void main(String[] args) {
        var googleStock = new Stock();
        var buyStockOrder = new BuyStock(googleStock);
        var sellStockOrder = new SellStock(googleStock);
        var broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
