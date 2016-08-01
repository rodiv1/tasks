package Vlad.course.lesson2.hometask;

/**
 * Created by Гудвін on 30.07.2016.
 1. Среднее арифметическое элементов массива.
 */
public class task04 {
    public static void main(String[] args) {
    int[] mas = {1,2,3,4};

    int result = 0;

        for (int i = 0; i < mas.length; i++){
            result += mas[i];

        }
        System.out.println(result/mas.length);
    }
}
