package Vlad.course.lesson4.homework;

import java.util.Arrays;

/**
 Написать функцию, которая принимает массив чисел в качестве
 аргумента, увеличивает его первые 3 элемента на 1 и
 возвращает их сумму как результат. После изменения массив и
 сумму надо вывести на экран.
 */
public class task02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random() * 10 + 1);
            arr[i] = rnd;
            
        }
        System.out.println(Arrays.toString(arr));
        method(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void method(int[] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i] += 1;
        }
    }
}


