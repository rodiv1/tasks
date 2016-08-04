package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
 * Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к
 * элементу из второго массива с i-ым индексом.
 * Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
 */
public class task09 {
    public static void main(String[] args) {
        double[] arr1 = new double[10], arr2 = new double[10];
        double[] arr3 = new double[10];
        for (int i = 0; i < arr1.length; i++){
            int rand = (int)(Math.random() * 9 + 1);
            arr1[i] = rand;
        }
        for (int i = 0; i < arr2.length; i++){
            int rand = (int)(Math.random() * 9 + 1);
            arr2[i] = rand;
        }
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = arr1[i]/arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int schet = 0;
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] % 2 == 0){
                schet++;
            }
        }
        System.out.println(schet);
    }
}
