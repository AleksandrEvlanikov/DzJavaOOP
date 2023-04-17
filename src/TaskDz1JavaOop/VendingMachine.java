package TaskDz1JavaOop;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottle = ((BottleOfWater) product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    public Snack getShack(String name, int weight) {
        for (Product product : products) {
            if (product instanceof Snack) {
                Snack chocolate = ((Snack) product);
                if (chocolate.name.equals(name) && chocolate.getWeight() == weight)
                    return chocolate;
            }

        }
        return null;
    }


}
