package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class task08 {
    public static void main(String[] args) {
    int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++){
            int rand = (int)(Math.random() * 30 -15);
            arr[i] = rand;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int k = 0; k < arr.length; k ++){
            if (arr[k] == max){
                System.out.println(k);
            }
        }
    }
}
