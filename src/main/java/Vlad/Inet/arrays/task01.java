package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет размера.
 */
public class task01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, j;
        for (i = 2, j = 0; i <= 20; i += 2, j++){
            arr[j] = i;
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        for (i = 2, j = 0; i <= 20; i += 2, j++){
            arr[j] = i;
            System.out.println(arr[j] + " ");
        }

    }
}
