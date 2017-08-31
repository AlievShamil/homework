package lesson_3.sweets;

import lesson_3.Sweetness;

public class BananaBread extends Sweetness {
    private int calories;

    public BananaBread(String name, double weight, double price, int calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " калорийность - " + calories;
    }
}
