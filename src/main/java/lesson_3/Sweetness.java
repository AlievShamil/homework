package lesson_3;


import static java.lang.String.format;

public abstract class Sweetness {
    private String name;
    private double weight;
    private double price;

    public Sweetness(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return format("\n\t%s, вес - %.3fкг, цена - %.2fруб", name, weight, price);
    }
}
