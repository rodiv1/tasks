package Vlad.Inet.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 02.08.2016.
 * Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера
 * из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и сообщить
 * пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
 * Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
 * пока не будет указано корректное значение.
 */
public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        if (n % 2 != 0){
        do {
            n = sc.nextInt();
        }while (n % 2 != 0);
        }

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int rnd = (int) (Math.random() * 10 - 5);
            arr[i] = rnd;
        }
        System.out.println(Arrays.toString(arr));

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length/2; i++){
            sum1 += Math.abs(arr[i]);
        }
        System.out.println(sum1);
        for (int i = arr.length/2; i < arr.length; i++){
            sum2 += Math.abs(arr[i]);
        }
        System.out.println(sum2);

        if (sum1 > sum2){
            System.out.println("First module more!");
        }else if (sum1 < sum2){
            System.out.println("Second module more!");
        }else {
            System.out.println("Equal module!");
        }
    }
}
