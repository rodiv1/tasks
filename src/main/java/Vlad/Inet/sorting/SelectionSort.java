package Vlad.Inet.sorting;


import java.util.Arrays;

/**
 * Created by Гудвін on 08.08.2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++){
        int rand = (int)(Math.random() * 10);
        arr[i] = rand;
    }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
    /* Предполагаем, что начальный элемент рассматриваемого
     * фрагмента и будет минимальным.
     */
            int min = arr[i]; // Предполагаемый минимальный элемент
            int imin = i; // Индекс минимального элемента
    /* Просматриваем оставшийся фрагмент массива и ищем там
     * элемент, меньший предположенного минимума.
     */
            for (int j = i+1; j < arr.length; j++) {
        /* Если находим новый минимум, то запоминаем его индекс.
         * И обновляем значение минимума.
         */
                if (arr[j] < min) {
                    min = arr[j];
                    imin = j;
                }
            }
    /* Проверяем, нашёлся ли элемент меньше, чем стоит на
     * текущей позиции. Если нашёлся, то меняем элементы местами.
     */
            if (i != imin) {
                int temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
