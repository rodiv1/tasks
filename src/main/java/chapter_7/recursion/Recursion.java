package chapter_7.recursion;

/**
 * Created by Vlad on 31.01.2016.
 */
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial 3 equal: " + f.fact(3));
        System.out.println("Factorial 4 equal: " + f.fact(4));
        System.out.println("Factorial 5 equal: " + f.fact(5));
    }
}
