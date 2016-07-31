package course.lesson1.hometask;

import java.util.Scanner;

/**
 * Created by Гудвін on 29.07.2016.
 1. Прочитать с консоли число 1
 2. Прочитать с консоли число 2
 3. Вывести результат
 4. И так для каждого оператора
 */
public class values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt(), i2 = sc.nextInt();
        System.out.println("Enter values:");
        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);
        System.out.println(i1 % i2);

    }
}
