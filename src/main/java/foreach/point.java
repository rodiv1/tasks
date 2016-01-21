package foreach;

/**
 * Created by Vlad on 22.01.2016.
 */
public class point {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            for (int j = i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
