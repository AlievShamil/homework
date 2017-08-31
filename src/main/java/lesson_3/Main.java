package lesson_3;

import lesson_3.sweets.*;

public class Main {

    public static void main(String[] args) {
        // Возможно стоило создать отдельно массив сладостей, затем передать в конструктор...
        Gift extinctAndroid = new Gift("Вымерщие версии android", new Sweetness[]{
                new ApplePie("Яблочный Пирог", 1.44, 544,"Джонатан"),
                new BananaBread("Банановый хлеб", 0.34, 138, 211),
                new Cupcake("Кекс", 0.96, 214," Ромовый кекс"),
                new Donut("Пончик", 0.4, 35," с джемом"),
                new Eclair("Эклер", 0.31, 156, " пьяный эклер"),
                new Froyo("Замороженный йогурт", 1.75, 156, " Тutti Frutti Frozen Yogurt")
        });

        // Вот тут поленился придумывать уникальный параметр
        Gift deprecatedAndroid = new Gift("Устаревшие версии android", new Sweetness[]{
                new Gingerbread("Имбирный пряник", 1.44, 544),
                new Honeycomb("Конфеты Соты", 0.34, 138),
                new IceCreamSandwich("Мороженное Сэндвич", 0.96, 214),
                new JellyBean("Мармелад", 0.4, 35),
                new KitKat("Кит-Кат", 0.31, 156)
        });

        // и тут тоже =)
        Gift currentAndroid = new Gift("Актуальная версии android", new Sweetness[]{
                new Lollipop("Леденцы", 1.44, 544),
                new Marshmallow("Зефир", 0.34, 138),
                new Nougat("Нуга", 0.96, 214),
                new Oreo("Орео", 0.4, 35)
        });

        System.out.println(extinctAndroid.toString());
        extinctAndroid.findTotalWeightAndPrint();
        extinctAndroid.findTotalPriceAndPrint();
        System.out.println("----------------------------------------------------------------------");

        System.out.println(deprecatedAndroid.toString());
        deprecatedAndroid.findTotalWeightAndPrint();
        deprecatedAndroid.findTotalPriceAndPrint();
        System.out.println("----------------------------------------------------------------------");

        System.out.println(currentAndroid.toString());
        currentAndroid.findTotalWeightAndPrint();
        currentAndroid.findTotalPriceAndPrint();
    }
}
