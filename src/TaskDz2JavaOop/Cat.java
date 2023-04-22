package TaskDz2JavaOop;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
//    public boolean isFull() {
//        return satiety && appetite <= 0;
//    }

    public void eat(Plate plate) {
        if (!satiety && plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

}


