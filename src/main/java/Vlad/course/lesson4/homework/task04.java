package Vlad.course.lesson4.homework;

import java.util.Arrays;

/**
 Написать ф-ю для объединения 2-х массивов в один. Вывести
 результат на консоль.
 */
public class task04 {
    
    public static void main(String[] args) {
        int[] first = {1,2,5,6,7};
        int[] second = {1,5,7,2};
        int[] res = new int[first.length + second.length];
        System.arraycopy(first, 0, res, 0, first.length);
        System.arraycopy(second, 0, res, first.length, second.length);
        System.out.println(Arrays.toString(res));
    }
}
