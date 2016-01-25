package chapter_6.clas.Box_4;

/**
 * Created by Vlad on 25.01.2016.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}
