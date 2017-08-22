package lesson_1;


import java.util.Scanner;

public class Task2 {

    private static int wordLength;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Исходный текст:");
        String str = "Я хороший разработчик автотестов";
        System.out.println(str + "\n");


        //замена слова
        System.out.println("Введите новое слово:");
        String newWord = scanner.nextLine();
        wordLength = newWord.length();
        String newStr = replaceWord(str, newWord);
        System.out.println("Текст после замены слова:");
        System.out.println(newStr + "\n");

        scanner.close();

        // получение новый строки
        System.out.println("Новая строка:");
        printSubStr(newStr);
    }

    private static String replaceWord(String str,String newWord) {
        return str.replace("хороший", newWord);
    }

    private static void printSubStr(String str) {
        int beginIndex = wordLength+3;
        int endIndex = beginIndex + 11;
        System.out.println(str.substring(beginIndex, endIndex));
    }

}
