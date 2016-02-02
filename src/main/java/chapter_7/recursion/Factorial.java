package chapter_7.recursion;

/**
 * Created by Vlad on 31.01.2016.
 */
public class  Factorial {
    int fact(int n){
        int result;

        if(n==1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
