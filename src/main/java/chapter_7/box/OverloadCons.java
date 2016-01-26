package chapter_7.box;

/**
 * Created by Vlad on 27.01.2016.
 */
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        System.out.println("Volume mybox1 is equal: " + mybox1.volume());
        System.out.println("Volume mybox2 is equal: " + mybox2.volume());
        System.out.println("Volume mybox3 is equal: " + mybox3.volume());
    }
}
