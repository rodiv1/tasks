package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class task02 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 1, j = 0; i <100; i+=2, j++){
            arr[j] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 99, j = 0; i > 0; i-=2, j++){
            arr[j] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
