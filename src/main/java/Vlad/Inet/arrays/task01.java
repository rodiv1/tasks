package Vlad.Inet.arrays;

/**
 * Created by Гудвін on 02.08.2016.
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте, какого он будет размера.
 */
public class task01 {
    public static void main(String[] args) {
        int[] arr = new int[21];

        for (int i = 2; i <= 20; i += 2){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 2; i <= 20; i += 2){
            arr[i] = i;
            System.out.println(arr[i] + " ");
        }

    }
}
