package Vlad.course.lesson1.hometask;

import java.util.Scanner;

/**
 * Created by Гудвін on 29.07.2016.
 1. Прочитать строку 1
 2. Прочитать строку 2
 3. Прочитать строку 3
 4. Вывести на экран
 1. S1 + s3
 2. S3 + s2 + s1
 3. S1 + s2 + s3
 */
public class strings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine();
        System.out.println("Enter strings:");
        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);
    }
}
