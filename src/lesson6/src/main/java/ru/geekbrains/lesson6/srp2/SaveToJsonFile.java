package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJsonFile extends Order {

    public SaveToJsonFile(String clientName, String product, int qnt, int price) {
        super(clientName, product, qnt, price);
    }


    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ getClientName() + "\",\n");
            writer.write("\"product\":\""+ getProduct() +"\",\n");
            writer.write("\"qnt\":"+ getQnt() +",\n");
            writer.write("\"price\":"+ getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
