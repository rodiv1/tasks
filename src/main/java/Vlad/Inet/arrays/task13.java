package Vlad.Inet.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 02.08.2016.
 * Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
 * Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 * Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sec = 0;
        if (n < 3){
            do {
                n = sc.nextInt();
            }while (n < 4);
        }

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random() * n);
            arr[i] = rnd;
            if (arr[i] % 2 == 0 && arr[i] > 0){
                sec++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] second = new int[sec];

        for (int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0 && arr[i] > 0){
                second[j] = arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(second));
    }
}
