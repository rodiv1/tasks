package Continue;

/**
 * Created by Vlad on 22.01.2016.
 */
public class Continue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }
}
