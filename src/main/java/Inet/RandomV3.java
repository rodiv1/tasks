package Inet;

/**
 * Created by Гудвін on 31.07.2016.
 */
public class RandomV3 {
    public static void main(String[] args) {
        for(int i = 0; i < 25; i++) {
            int rnd = (int) (Math.random() * 200-100);
            System.out.println(rnd);
        }
    }
}
