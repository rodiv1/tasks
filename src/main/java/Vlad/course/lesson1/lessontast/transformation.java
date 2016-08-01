package Vlad.course.lesson1.lessontast;

/**
 * Created by Гудвін on 28.07.2016.
 */
public class transformation {
    public static void main(String[] args) {
        byte a = (byte)(127 + 1);
        short x = Byte.MAX_VALUE + 1;
        byte y = (byte)x;
        byte z = (byte)(x +129);
        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
