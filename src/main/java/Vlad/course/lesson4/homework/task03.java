package Vlad.course.lesson4.homework;

/**
 Написать ф-ю, которая принимает на вход массив чисел и
 возвращает его длину в байтах как результат.
 */
public class task03 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        System.out.println(sizeof(a));
    }
    private static int sizeof(int[] a) {
        return a.length * 4;
    }
}
