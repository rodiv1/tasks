package Marina.course.hometask.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 01.08.2016.
 * Задать массив целых чисел длинной N эл.
 2. Поменять 1-й и последний элемент местами.
 3. Вывести массив на экран.
 */
public class task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int[] arr = new int [k];

        for (int i = 0; i<arr.length; i++) {
            arr [i] = scan.nextInt();
        }
        int f = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = f;
        System.out.println(Arrays.toString(arr));
    }
}
