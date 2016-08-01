package Vlad.course.lesson3.hometask;

import java.util.Arrays;

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
         System.out.print("for: ");
         for (int i = 10; i <= 20; i++){

             System.out.print(i + " ");
         }
        System.out.println();
        int w = 10;
        System.out.print("while: ");
        while (w != 21){
            System.out.print(w++ + " ");
        }
        System.out.println();
        System.out.print("do while: ");
        int d = 10;
        do{
            System.out.print(d++ + " ");
        }while (d !=21);


        //Вывести на экран все числа от 1 до 100, которые
        //делятся на 3 без остатка.
        System.out.println();
        System.out.println("Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.");

        for (int i = 0; i < 100; i += 3){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Заполнить массив числами от 100 до 0.");
        int[] mas = new int[101];
        for (int i = 100; i > 0; i--){
            mas[i] = i;
        }
        System.out.print(Arrays.toString(mas));
    }
}
