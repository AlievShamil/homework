package lesson_3;

import java.util.Arrays;

import static java.lang.String.format;

public class Gift {
    private String name;
    private Sweetness[] sweets;

    public Gift(String name, Sweetness[] sweets) {
        this.name = name;
        this.sweets = sweets;
    }

    public void findTotalWeightAndPrint() {
        double weight = 0;
        for (Sweetness sweet : sweets) {
            weight += sweet.getWeight();
        }
        System.out.println(format("Общий вес подарка \'%s\' - %.3f кг.", name, weight));
    }

    public void findTotalPriceAndPrint() {
        double price = 0;
        for (Sweetness sweet : sweets) {
            price += sweet.getPrice();
        }
        System.out.println(format("Общая стоимость подарка \'%s\' - %.2f руб.", name, price));
    }

    @Override
    public String toString() {
        return format("Подарок - \'%s\', сладости:%s\n",name,Arrays.toString(sweets));
    }
}
