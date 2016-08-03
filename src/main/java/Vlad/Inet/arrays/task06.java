package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class task06 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i ++){
            int rnd = (int) (Math.random() * 90 + 10);
            arr[i] = rnd;
        }
        System.out.println(Arrays.toString(arr));

        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]){
            System.out.println("The array is an increasing sequence numbers!");
        }else  {
            System.out.println("The array is not increasing sequence numbers!");
        }
    }
}
