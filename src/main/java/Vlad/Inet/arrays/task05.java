package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
 * (либо сообщите, что их средние арифметические равны).
 */
public class task05 {
    public static void main(String[] args) {
        int[] arr1 = new int[5], arr2 = new int[5];
        int arf1 = 0, arf2 = 0;
        for(int i = 0; i < arr1.length; i++){
            int rnd = (int) (Math.random() * 6);
            arr1[i] = rnd;

            arf1 += arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            int rnd = (int) (Math.random() * 6);
            arr2[i] = rnd;
            arf2 += arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println((double)arf1/arr1.length);
        System.out.println((double)arf2/arr2.length);

        if (arf1 > arf2){
            System.out.println("Over the first array!");
        }else if (arf2 > arf1){
            System.out.println("Over the first array!");
        }else  {
            System.out.println("Equal arrays!");
        }


    }
}
