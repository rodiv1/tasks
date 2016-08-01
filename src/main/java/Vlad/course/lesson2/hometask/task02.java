package Vlad.course.lesson2.hometask;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Гудвін on 30.07.2016.
 Задача 2:
 1. Задать массив целых чисел длинной N эл.
 2. Поменять 1-й и последний элемент местами.
 3. Вывести массив на экран.
 */
public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int M = sc.nextInt();

        int[] mas = new int[M];

        for (int i = 0; i < mas.length; i++){

            mas[i] = i;
        }
        int a = mas[0];
        mas[0] = mas[mas.length -1];
        mas[mas.length - 1] = a;
        System.out.println(Arrays.toString(mas));



    }
}
