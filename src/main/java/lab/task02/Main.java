package lab.task02;

public class Main {
    public static void main(String[] args) {
        String[] list={"d:\\1.txt","d:\\2.txt","d:\\3.txt"};
        Monitor m = new Monitor(list, new FileEvent());
        m.start();
    }
}