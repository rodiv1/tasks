package Vlad.Inet.multidimensiona_arrays.tasks;

/**
 * Created by Гудвін on 10.08.2016.
 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
 * Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class task03 {
    public static void main(String[] args) {
        int[][] da = new int[7][4];
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 6 - 6);
            }
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();// Переходим на следующую строку
        }
        int max = Math.abs(da[0][0]);
        for (int i = 0; i < da.length; i++){
            for(int j=0; j<da[i].length; j++) {
                if (Math.abs(da[i][j]) > max) {
                    max = Math.abs(da[i][j]);
                    System.out.print("Maximum:" + max);

                    System.out.println(" Index of element:" + i + " " + j);
                }
            }
        }

    }
}
