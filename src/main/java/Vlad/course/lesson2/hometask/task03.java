package Vlad.course.lesson2.hometask;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 30.07.2016.
 Задача 3:
 1. Ввести с клавиатуры массив из 10 чисел.
 2. Разбить его на 2 массива равной длинны.
 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */
public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] mas = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < mas.length -1; i++){
            mas[i] = sc.nextInt();
        }


        int[] mas2 = Arrays.copyOfRange(mas,0,mas.length/2);
        int[] mas3 = Arrays.copyOfRange(mas,mas.length/2, mas.length);
        Arrays.sort(mas2);
        Arrays.sort(mas3);

        System.out.println(Arrays.toString(mas2));
        System.out.println(Arrays.toString(mas3));

        }
    }

