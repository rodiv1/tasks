package chapter_6.clas.Box_2;

/**
 * Created by Vlad on 25.01.2016.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.depth = 10;
        mybox1.height = 15;
        mybox1.width = 20;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();

        mybox2.volume();
    }
}
