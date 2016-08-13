package Vlad.Inet.sorting;

import java.util.Arrays;

/**
 * Created by Гудвін on 10.08.2016.
 */
public class Sort_by_bubble {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 20);
            arr[i] = rand;
        }
        System.out.println(Arrays.toString(arr));

        /* Внешний цикл постоянно сужает фрагмент массива,
        * который будет рассматриваться, ведь после каждого прохода
        * внутреннего цикла на последнем месте фрагмента будет
        * оказываться нужный элемент (его не надо рассматривать снова).
        */
        for (int i = arr.length - 1; i >= 1; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

        /*System.out.println("Alternative!");

        for (int i = arr.length - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[j + 1]) {
                    do {
                        int rand = (int) (Math.random() * 20);
                        arr[i] = rand;
                    }while (arr[j] != arr[j + 1]);
                }
            }
            System.out.println(Arrays.toString(arr));
        }*/
    }
}