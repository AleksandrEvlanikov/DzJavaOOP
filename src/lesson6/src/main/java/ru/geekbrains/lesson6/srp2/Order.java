package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;


    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    protected String getClientName() {
        return clientName;
    }

    protected String getProduct() {
        return product;
    }

    protected int getQnt() {
        return qnt;
    }

    protected double getPrice() {
        return price;
    }



}
