package Marina.course.hometask.lesson2;

import java.util.Scanner;

/**
 * Created by Гудвін on 01.08.2016.
 1. Прочитать строку 1
 2. Прочитать строку 2
 3. Прочитать строку 3
 4. Вывести на экран
 1. S1 + s3
 2. S3 + s2 + s1
 3. S1 + s2 + s3
 */
public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println( s1+s3);
        System.out.println(s3+s2+s1);
        System.out.println(s1+s2+s3);
    }
}
