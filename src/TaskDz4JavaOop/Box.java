package TaskDz4JavaOop;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    private int quantity;

    public Box(T fruit, int quantity) {
        this.fruits = new ArrayList<T>();
        for (int i = 0; i < quantity; i++) {
            fruits.add(fruit);
        }
        this.quantity = quantity;

    }
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
    public void sprinkleBox(Box<T> anotherBox){
        if (this == anotherBox){
            return;  // сама в себя
        }
        if (fruits.isEmpty()) {
            return; // Нельзя пересыпать пустую
        }
        if (anotherBox.fruits.isEmpty()) {
            anotherBox.fruits.addAll(fruits);
            fruits.clear();
            return; // если вторая пустая
        }
        if (!fruits.get(0).getClass().equals(anotherBox.fruits.get(0).getClass())) {
            return; // нельзя пересыыпать разные фрукты
        }
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

