package Vlad.Inet.multidimensiona_arrays.tasks;

/**
 * Created by Гудвін on 10.08.2016.
 * Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
 * чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны повторяться.
 * В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения
 *(от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
 * При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
 */
public class task05 {
    public static void main(String[] args) {
        int[][] arr = new int[15][3];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*8) + 2;
                if(j==arr[i].length-1){
                    arr[i][j]= arr[i][j-2]*arr[i][j-1];
                    for (int k=0; k < i ;k ++){
                        if (arr[i][j] == arr[k][j] && i > 0){
                            if (arr[i][j-1]==arr[k][j-1] || arr[i][j-2] == arr[k][j-2]){
                                --i;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print("Приклад №" + (i + 1 + " Помножити "));
            for (int j = 0; j < arr[i].length; j++){
                if (j==0){
                    System.out.print(arr[i][j] + " на ");
                }else if (j==1){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}