package lesson_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double firstNum = scanner.nextDouble();
        System.out.println("Введите второе число");
        double secondNum = scanner.nextDouble();

        // 1 вариант
        solveEquationAndPrintVar1(firstNum, secondNum);

        // 2 вариант
        System.out.println("Результат: " + solveEquationVar2(firstNum, secondNum));


        scanner.close();


    }

    // Вариант 1 (решить все и сразу)
    private static void solveEquationAndPrintVar1(double num1, double num2) {
        double result = 3 * (num1 + 2 * num1 - num2) / (2 * num1);
        System.out.println("Результат вычисления: " + result);
    }

    /* Вариант 2:
    Создаем для каждой арифметической операции отдельный метод,
    и один метод для решения уравнения.
     */

    // Сложение
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Вычитание
    private static double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Умножение
    private static double mul(double num1, double num2) {
        return num1 * num2;
    }

    // Деление
    private static double div(double num1, double num2) {
        return num1 / num2;
    }

    private static double solveEquationVar2(double num1, double num2) {
        return div(mul(3, sub(add(num1, mul(2, num1)), num2)), mul(2, num1));
    }
}
