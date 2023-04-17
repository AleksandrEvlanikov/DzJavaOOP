package TaskDz1JavaOop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        //product1.brand = "ООО Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 100.15;

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Молоко коровка из Кореновки", 120.25);
        product2.param2 = "..";
        System.out.println(product2.displayInfo());

        //product2.price = -60;
        //product2.name = "______";
        System.out.println(product2.displayInfo());

        Product product3 = new Product("ss", "__", 100);
        System.out.println(product3.displayInfo());
        product3.setPrice(10);

        Product bottleOfWater1 = new BottleOfWater("Святой источник", 100, 2);
        Product bottleOfMilk1 = new BottleOfMilk("Молоко коровка из Кореновки", 200, 1, 10);
        Product bottleOfWater2 = new BottleOfWater("Святой источник", 100, 1);
        Product bottleOfWater3 = new BottleOfWater("Святой источник", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Святой источник", 100, 2);
        Product snack1 = new Snack("Snickers", 100, 70);
        Product snack2 = new Snack("Snickers", 200, 140);
        Product snack3 = new Snack("Picnic", 220, 180);

        String s = "123";
        String aaaa = "123";
        String s1 = new String("123");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(snack1);
        products.add(snack2);
        products.add(snack3);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Святой источник", 1);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
        Snack snackRes = vendingMachine.getShack("Snickers", 140);
        if (snackRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(snackRes.displayInfo());
        }
        else {
            System.out.println("Такого сникерса нет в автомате.");
        }




    }
}