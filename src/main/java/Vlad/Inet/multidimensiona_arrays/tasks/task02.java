package Vlad.Inet.multidimensiona_arrays.tasks;

/**
 * Created by Гудвін on 10.08.2016.
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран.
 * После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).
 */
public class task02 {
    public static void main(String[] args) {
        int[][] da = new int[6][4];
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 200 - 100);
            }
        }
        for(int i=0; i<da.length; i++) {
            for(int j=0; j<da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }
        int max = da[0][0];
        for (int i = 1; i < da.length; i++){
            for(int j=0; j<da[i].length; j++) {
                if (da[i][j] > max) {
                    max = da[i][j];
                }
            }
        }
        System.out.println("Maximum values: " + max);
    }
}
