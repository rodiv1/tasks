package chapter_7.passob;

/**
 * Created by Vlad on 27.01.2016.
 */
public class Test {
    int a,b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean eqauls(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
