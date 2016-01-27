package chapter_7.args.value;

/**
 * Created by Vlad on 27.01.2016.
 */
public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 30;
        System.out.println("a & b to call: " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a & b after call: " + a + " " + b);

    }
}
