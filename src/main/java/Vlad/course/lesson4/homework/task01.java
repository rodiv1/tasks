package Vlad.course.lesson4.homework;

import java.util.Scanner;

/**
 Написать функцию, которая принимает в качестве аргументов
 одну строку X, целое число Y и число с плавающей точкой Z и
 возвращает как результат строку в виде
 S = x + y + z.
 */
public class task01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter values: ");
        String s = sc.nextLine();
        int i = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println(method(s, i,d));
        
    }
    static String method(String s, int i, double d){
        String result = s + i + d;
        return result;
    }
    
}
