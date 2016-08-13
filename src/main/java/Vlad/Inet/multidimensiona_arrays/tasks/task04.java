package Vlad.Inet.multidimensiona_arrays.tasks;

import java.util.Arrays;

/**
 * Created by Гудвін on 10.08.2016.
 *Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран.
 * Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
 * При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
 * Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
 * а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
 */
public class task04 {
    public static void main(String[] args) {
        int[][] da = new int[6][7];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();// Переходим на следующую строку
        }
        int line = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < da[i].length; j++) {
                line++;
            }
        }
        System.out.println("Sorting array:");
        int[] arr = new int[line];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                arr[j] = da[i][j];

            }
            Arrays.sort(arr);
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = arr[j];
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();// Переходим на следующую строку
        }
    }
}