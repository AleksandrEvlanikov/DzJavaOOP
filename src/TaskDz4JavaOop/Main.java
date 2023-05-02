package TaskDz4JavaOop;

public class Main {
    public static void main(String[] args) {

    Apple app = new Apple();
    Orange ora = new Orange();
//    System.out.println(app.getWeight());
//    System.out.println(ora.getWeight());

        Box<Apple> appleBox = new Box<>(app, 3);
        Box<Orange> orangeBox = new Box<>(ora, 4);
        Box<Apple> newAppleBox = new Box<>(app, 0);




        if (appleBox.getWeight() == orangeBox.getWeight()){
            System.out.println("Яблоки = " + appleBox.getWeight());
            System.out.println("Апельсины = " + orangeBox.getWeight());
            System.out.println("Вес коробок равен.");
        }
        else {
            System.out.println("Яблоки = " + appleBox.getWeight());
            System.out.println("Апельсины = " + orangeBox.getWeight());
            System.out.println("Вес коробок разный.");
        }
        System.out.println();

        for (Apple apple : appleBox.getFruits()) {
            System.out.println(apple);
        }
        System.out.println("-----------");
        for (Orange orange : orangeBox.getFruits()) {
            System.out.println(orange);
        }
        System.out.println();
        System.out.println("Коробка с яблокоми №1: " + appleBox.getWeight());
        System.out.println("Коробка с яблокоми №2: " + newAppleBox.getWeight());
        appleBox.sprinkleBox(newAppleBox); // пересыпали в другую коробку
        System.out.println("Пересыпам.");
        System.out.println("Коробка с яблокоми №1: " + appleBox.getWeight());
        System.out.println("Коробка с яблокоми №2: " + newAppleBox.getWeight());
    }
}
