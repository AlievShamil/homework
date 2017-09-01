package lesson_4;

import java.util.*;

import static java.lang.String.format;

public class TopPlayers {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Роналдо", 787);
        map.put("Диего Марадона", 999);
        map.put("Зинедин Зидан", 624);
        map.put("Криштиану Роналду", 850);
        map.put("Лев Яшин", 354);
        map.put("Герд Мюллер", 421);
        map.put("Пеле", 900);
        map.put("Марко Ван Бастен", 741);
        map.put("Райан Гиггз", 90);
        map.put("Мирамонтес Луис Суарес", 522);
        map.put("Лионель Месси", 985);

        Map<String, Integer> sortedMap = sortAndRevers(map);
        // 1. Вывести отсортированный по убыванию список очков всех игроков
        printMap(sortedMap.values());
        System.out.println("---------------------------------");
        // 2. Вывести список игроков с их очками по убыванию
        printMap(sortedMap);
        System.out.println("---------------------------------");
        //3. Вывести топ-3 игрока с максимальным количеством очков
        printMap(sortedMap, 5);

    }

    public static Map<String, Integer> sortAndRevers(Map<String, Integer> map) {
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Map<String, Integer> copy = new LinkedHashMap<>();
        Collections.sort(list);
        for (int i = list.size(); i > 0; i--) {
            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                if (pair.getValue().equals(list.get(i - 1)))
                    copy.put(pair.getKey(), pair.getValue());
            }

        }

        map.clear();
        map.putAll(copy);
        return map;
    }
    // Создал 3 перегруженных метода на каждый случай
    public static void printMap(Collection<Integer> col) {
        System.out.println("Отсортированный по убыванию список очков всех игроков:");
        for (int i : col) {
            System.out.println(i);
        }
    }

    public static void printMap(Map<String, Integer> map) {
        System.out.println("Список игроков с их очками отсортированный по убыванию:");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }

    public static void printMap(Map<String, Integer> map,int topLevel) {
        System.out.println(format("Топ-%s",topLevel));
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
            for (int i = 0; iterator.hasNext() && i != topLevel; i++) {
                Map.Entry<String, Integer> pair = iterator.next();
                System.out.println(pair.getKey()+" - "+pair.getValue());
            }
    }
}
