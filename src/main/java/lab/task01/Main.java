package lab.task01;

public class Main {
    public static void main(String[] args) {
        String[] list = {"d:\\notes3.txt"};
        Monitor m = new Monitor(list,new FileEvent());
        m.start();
    }
}