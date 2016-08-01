package Vlad.course.lesson3.hometask;

/**
 * Created by Гудвін on 01.08.2016.
 1. Вывести на экран числа от 10 до 20 с помощью
 всех известных циклов.
 2. Вывести на экран все числа от 1 до 100, которые
 делятся на 3 без остатка.
 3. Заполнить массив числами от 100 до 0.
 */
public class task01 {
    public static void main(String[] args) {

        //цикли
         for (int i = 10; i < 20; i++){
             System.out.print("for: " + i);
         }
        int w = 10;
        while (w < 20){
            System.out.print("while: " + w);
        }
    }
}
