package chapter_7.overload_1;

/**
 * Created by Vlad on 26.01.2016.
 */
public class OverloadDemo {
    void test(){
        System.out.println("Parameters missing");
    }

    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a & b: " + a + " " + b);

    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
