package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class InputDataOrder extends Order {


    public InputDataOrder(String clientName, String product, int qnt, int price) {
        super(clientName, product, qnt, price);
    }

    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
