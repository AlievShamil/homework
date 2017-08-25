package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class Task {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 2, 3, 4, 5, 2, 2, 12, 4, 2, 5, 6, 6, 3, 2, 3, 3, 3, 3, 2};
        boolean isPressQ = false;
        Scanner scanner = new Scanner(System.in);

        while (!isPressQ) {
            System.out.println("Введите номер задания");
            String value = scanner.next();
            if (value.equals("q")) {
                System.out.println("Good Bye!");
                isPressQ = true;
            } else {
                switch (Integer.parseInt(value)) {
                    case 1:
                        sortArrayAndPrint(array);
                        break;
                    case 2:
                        findSumMinAndMaxAndPrint(array);
                        break;
                    case 3:
                        findMostTimesRepeatedNumberAndPrint(array);
                        break;
                    default:
                        System.out.println("Введите 1, 2 или 3");

                }
            }
        }
    }


    private static void sortArrayAndPrint(int[] array) {
        Arrays.sort(array);

        for (int i = array.length; i > 0; i--) {
            int elem = array[i - 1];
            if (i > 1) {
                System.out.print(format("%s ", elem));
            } else {
                System.out.print(format("%s\n\n", elem));
            }
        }
    }

    private static void findSumMinAndMaxAndPrint(int[] array) {
        Arrays.sort(array);
        int sum = array[array.length - 1] + array[0];
        System.out.println(format("Сумма min и max равна: %s\n\n", sum));

    }

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
        System.out.println(format("%s количество повторений - %s\n", result, maxRepeat));
    }

}

