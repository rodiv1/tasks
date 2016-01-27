package chapter_7.args.link;

/**
 * Created by Vlad on 27.01.2016.
 */
public class Test {
    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
