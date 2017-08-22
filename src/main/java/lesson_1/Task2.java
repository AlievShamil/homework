package lesson_1;


public class Task2 {

    public static void main(String[] args) {
        System.out.println("Исходный текст:");
        String str = "Я хороший разработчик автотестов";
        System.out.println(str+"\n");


        //замена слова "хороший"
        System.out.println("Текст после замены слова:");
        str =  str.replace("хороший","гениальный");
        System.out.println(str+"\n");

        // получение новый строки
        System.out.println("новая строка:");
        String subStr = str.substring(13,24);
        System.out.println(subStr);
    }

}
