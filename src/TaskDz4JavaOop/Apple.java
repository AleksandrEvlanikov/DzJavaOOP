package TaskDz4JavaOop;

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Apple " + getWeight();
    }
}
