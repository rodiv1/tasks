package Vlad.Inet.arrays;

import Vlad.Inet.Random;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class task03 {
    public static void main(String[] args) {

        int[] arr = new int[15];
        int res = 0;
        for (int i = 0; i < arr.length; i++){
            int rnd = (int) (Math.random() * 10);
            arr[i] = rnd;
            if (0 < arr[i] && arr[i]%2 == 0){
                res++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
}
