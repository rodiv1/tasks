package Vlad.Inet.arrays;

import java.util.Arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
 * чтобы отрицательных и положительных элементов там было поровну и не было нулей.
 * При этом порядок следования элементов должен быть случаен
 * (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел или
 * же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
 *
 */
public class task12 {
    public static void main(String[] args) {
    int[] arr = new int[12];
    int plus = 0, minus = 0;
            for(int i = 0; i < arr.length; i++) {
                int rnd = (int) (Math.random() * 22 - 11);
                arr[i] = rnd;

                if (arr[i] == 0){
                    do {
                        int rand = (int) (Math.random() * 22 - 11);
                        arr[i] = rand;
                    }while (arr[i] == 0);
                }

                if (arr[i] > 0) {
                    plus++;
                    if (plus > 6){
                        arr[i] *= -1;
                    }
                }else if (arr[i] < 0){
                    minus++;
                    if (minus > 6){
                        arr[i] *= -1;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
