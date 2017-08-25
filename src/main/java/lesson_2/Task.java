package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class Task {

    private static final int FIRST_TASK = 1;
    private static final int SECOND_TASK = 2;
    private static final int THIRD_TASK = 3;

    private static final String INIT_TEXT = "Введите номер задачи";

    public static void main(String[] args) {

        int[] array = {3, 1, 2, 2, 3, 4, 5, 2, 2, 12, 4, 2, 5, 6, 6, 3, 2, 3, 3, 3, 3, 2};

        go(array);
    }

    private static void go(int[] array) {
        Scanner scanner = new Scanner(System.in);
        boolean isPressQ = false;
        System.out.println(INIT_TEXT);

        while (!isPressQ) {
            String value = scanner.next();

            try {
                switch (Integer.parseInt(value)) {
                    case FIRST_TASK:
                        sortArrayAndPrint(array);
                        break;
                    case SECOND_TASK:
                        findSumMinAndMaxAndPrint(array);
                        break;
                    case THIRD_TASK:
                        findMostTimesRepeatedNumberAndPrint(array);
                        break;
                    default:
                        System.out.println("\nВведите 1, 2 или 3");
                }
            } catch (NumberFormatException ex) {
                if (value.equals("q")) {
                    System.out.println("Good Bye!");
                    isPressQ = true;
                    scanner.close();
                } else {
                    System.out.println(format("\n%s", INIT_TEXT));
                }
            }
        }
    }

    private static void arraySort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    // 1 Задание: сортировка с помощью Arrays.sort() и вывод с конца
    private static void sortArrayAndPrint(int[] array) {
        arraySort(array);

        for (int i = array.length; i > 0; i--) {
            int elem = array[i - 1];
            if (i > 1) {
                System.out.print(format("%s ", elem));
            } else {
                System.out.print(format("%s\n\n", elem));
            }
        }
        System.out.println(INIT_TEXT);
    }

    // 2 Задание: сортировка с помощью Arrays.sort() и сумма первого и последнего элемента
    private static void findSumMinAndMaxAndPrint(int[] array) {
        Arrays.sort(array);
        int sum = array[array.length - 1] + array[0];
        System.out.println(format("Сумма min и max равна: %s\n\n%s", sum, INIT_TEXT));

    }

    // 3 Задание: даже не знаю как объяснить =)
    private static void findMostTimesRepeatedNumberAndPrint(int[] array) {
        String result = "";
        int maxRepeat = 0;
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            int repCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repCount++;
                    value = array[i];
                }
            }
            if (repCount > maxRepeat) {
                maxRepeat = repCount;
                result = String.valueOf(value);
            } else if (repCount == maxRepeat) {
                if (!result.contains(String.valueOf(value))) {
                    result = format("%s, %s", result, value);
                }
            }
        }
        String newStr = result.length() <= 1 ?
                format("Число - %s, количество повторений: %s\n\n%s", result, maxRepeat, INIT_TEXT) :
                format("Числа - %s, количество повторений: %s\n\n%s", result, maxRepeat, INIT_TEXT);
        System.out.println(newStr);

    }

}

