package Vlad.books.KSBB.example;

/**
 * Created by Vlad on 27.10.2016.
 */
public class Shufflel {
    public static void main(String[] args) {
        int x = 3;
        while(x > 0){
            if(x > 2){
                System.out.print("a");
            }else if (x==2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1){
                System.out.print("d");
                x = x - 1;
            }
            
        }
    }
}
