package TaskDz4JavaOop;

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Orange " + getWeight();
    }
}
