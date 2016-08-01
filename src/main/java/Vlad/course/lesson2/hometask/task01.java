package Vlad.course.lesson2.hometask;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 30.07.2016.
 1. Задать массив целых чисел длинной 10 эл.
 2. Отсортировать числа в массиве
 3. Вывести на экран результат.
 4. Сделать возможность наполнения массива с клавиатуры*.
 */
public class task01 {
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

        Arrays.sort(mas);
        String result = Arrays.toString(mas);
        System.out.println(result);

    }
}
