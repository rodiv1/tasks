package Marina.course.hometask.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 01.08.2016.
 * Задать массив целых чисел длинной 10 эл.
 2. Отсортировать числа в массиве
 3. Вывести на экран результат.
 4. Сделать возможность наполнения массива с клавиатуры*.
 */
public class task03 {
    public static void main(String[] args) {
        int[] arr = new int [10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<arr.length; i++) {
            arr [i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
