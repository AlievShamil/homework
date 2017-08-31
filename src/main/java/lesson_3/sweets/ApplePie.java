package lesson_3.sweets;

import lesson_3.Sweetness;

public class ApplePie extends Sweetness {
    private String appleBrand;

    public ApplePie(String name, double weight, double price, String appleBrand) {
        super(name, weight, price);
        this.appleBrand = appleBrand;
    }

    @Override
    public String toString() {
        return super.toString() + " Сорт яблок - " + appleBrand;

    }
}
