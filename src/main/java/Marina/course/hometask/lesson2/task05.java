package Marina.course.hometask.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 01.08.2016.
 * Ввести с клавиатуры массив из 10 чисел.
 2. Разбить его на 2 массива равной длинны.
 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */
public class task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for( int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int arr2[] = Arrays.copyOfRange(arr, 0, arr.length/2);
        int arr3[] = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
