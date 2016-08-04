package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
 * Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
 * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
public class task10 {
    public static void main(String[] args) {
    int[] arr = new int[11];
        int one = 0, zero = 0;
        for(int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random() * 3 - 1);
            arr[i] = rnd;
            if (arr[i] == 1){
                one++;
            }else if (arr[i] == 0){
                zero++;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (one > zero){
            System.out.println("1 more!");
        }else {
            System.out.println("0 more!");
        }
    }
}
