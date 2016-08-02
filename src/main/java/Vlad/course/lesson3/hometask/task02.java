package Vlad.course.lesson3.hometask;

/**
 * Created by Гудвін on 02.08.2016.
 Дано массив из 10 целых чисел. Вывести на экран
 сумму всех его элементов кроме первого и
 последнего.
 */
public class task02 {
    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 1; i < mas.length - 1; i++){
            sum += mas[i];
        }
        System.out.println(sum);
    }
}
