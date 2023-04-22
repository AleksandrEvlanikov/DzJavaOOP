package TaskDz2JavaOop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Черныш - ", 40);
        Cat cat2 = new Cat("Пушистик - ", 40);
        Cat cat3 = new Cat("Барсик - ", 40);
        Plate plate = new Plate(100);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat catRes: cats){
            if (catRes.getAppetite() <= plate.getFood()) {
                catRes.eat(plate);
                System.out.println(catRes.getName() + "Поел и наелся.");
//                plate.info();
            } else {
                System.out.println(catRes.getName() + "остался голодным.");
            }
        }
        System.out.println();
        for (Cat catRes: cats) {
            System.out.println(catRes.getName() + "Сытость - " + catRes.isSatiety());
        }


//        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
