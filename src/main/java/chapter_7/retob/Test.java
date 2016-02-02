package chapter_7.retob;

/**
 * Created by Vlad on 30.01.2016.
 */
public class Test {
    int a;

    Test(int i){
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}
