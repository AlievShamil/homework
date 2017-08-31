package lesson_3.sweets;

import lesson_3.Sweetness;

public class Cupcake extends Sweetness {
    private String descName;

    public Cupcake(String name, double weight, double price, String descName) {
        super(name, weight, price);
        this.descName = descName;
    }

    @Override
    public String toString() {
        return super.toString()+descName;
    }
}
