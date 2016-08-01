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

        int[] mas = new int[10];
        System.out.println("Enter elements(10) of array: ");
        mas[0] = sc.nextInt();
        mas[1] = sc.nextInt();
        mas[2] = sc.nextInt();
        mas[3] = sc.nextInt();
        mas[4] = sc.nextInt();
        mas[5] = sc.nextInt();
        mas[6] = sc.nextInt();
        mas[7] = sc.nextInt();
        mas[8] = sc.nextInt();
        mas[9] = sc.nextInt();

        int[] mas2 = Arrays.copyOfRange(mas,0,mas.length/2);
        int[] mas3 = Arrays.copyOfRange(mas,mas.length/2, mas.length);
        Arrays.sort(mas2);
        Arrays.sort(mas3);

        System.out.println(Arrays.toString(mas2));
        System.out.println(Arrays.toString(mas3));

        }
    }

