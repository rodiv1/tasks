package Marina.course.hometask.lesson2;

import java.util.Scanner;

/**
 * Created by Гудвін on 01.08.2016.
 * 1. Прочитать с консоли число 1
 2. Прочитать с консоли число 2
 3. Вывести результат
 4. И так для каждого оператора
 */
public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int k = sc.nextInt(), m = sc.nextInt();
        System.out.println(k+m);
        System.out.println(k-m);
        System.out.println(k*m);
        System.out.println(k/m);
        System.out.println(k%m);
    }
}
