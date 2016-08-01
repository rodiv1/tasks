package Vlad.course.lesson2.hometask;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Гудвін on 30.07.2016.
 - Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
 - Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
 элементами, а затем выводить нужный элемент по его индексу на консоль.
 */
public class task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введи розмір масиву:");
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i=0; i < a.length; i++) {
            System.out.println("Введи " + i + "-й елемент масиву:");
            a[i] = scan.nextInt();
        }

        //Изначальный массив
        System.out.println("Масив А:");
        String s = Arrays.toString(a);
        System.out.println(s);

        //Функция переворота
        int c;
        for(int i = 0; i < a.length/2; i++) {
            c = a[a.length-1-i];
            a[a.length-1-i] = a[i];
            a[i] = c;
        }

        //Зеркальный массив
        System.out.println("Зеркальний масив А:");
        s = Arrays.toString(a);
        System.out.println(s);


        System.out.println("Введи індекс елементу, який ви хочете на консоль (від 0 до " + (a.length - 1) + "):" );
        int j = scan.nextInt();
        System.out.println(j + "-й елемент массиву (індескація починається з 0):");
        System.out.println(a[j]);


    }
}
