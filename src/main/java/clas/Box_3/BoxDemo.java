package clas.Box_3;

/**
 * Created by Vlad on 25.01.2016.
 */
public class BoxDemo {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.depth = 10;
        mybox1.height = 15;
        mybox1.width = 20;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();
        System.out.println("Volume is equal to: " + vol);


        System.out.println("Volume is equal to: " + mybox2.volume());

    }
}
