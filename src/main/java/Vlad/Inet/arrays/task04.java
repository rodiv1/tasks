package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
public class task04 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            int rnd = (int) (Math.random() * 10 + 1);
            arr[i] = rnd;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 !=0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
