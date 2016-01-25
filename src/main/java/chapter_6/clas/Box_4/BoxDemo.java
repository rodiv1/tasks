package chapter_6.clas.Box_4;

/**
 * Created by Vlad on 25.01.2016.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box(3,6,9);


        System.out.println("Volume is equal to: " + mybox1.volume());

        System.out.println("Volume is equal to: " + mybox2.volume());
    }
}
