package Vlad.course.lesson1.lessontast;

/**
 * Created by Гудвін on 28.07.2016.
 */
public class runtime {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(r.availableProcessors());

        System.out.println(r.totalMemory());
    }
}
