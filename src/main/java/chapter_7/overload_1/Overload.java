package chapter_7.overload_1;

/**
 * Created by Vlad on 26.01.2016.
 */
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int res;

        ob.test();
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Result calling ob.test(123.25): " + result);

    }
}
