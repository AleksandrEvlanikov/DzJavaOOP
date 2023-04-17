package TaskDz1JavaOop;

public class Snack extends Product {
    private int weight; // Вес

    public int getWeight() {
        return weight;
    }

    public Snack(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("%s, %s, %fруб, %dг", brand, name, price, weight);
    }
}
