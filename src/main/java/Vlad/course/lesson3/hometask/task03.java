package Vlad.course.lesson3.hometask;


import java.util.Scanner;

/**
 * Created by Гудвін on 02.08.2016.+
 * Написать игру «Крестики нолики» используя двухмерные массивы.
 */
public class task03 {
    public static void main(String[] args) {
        char[][] arr = new char[3][3];

        do {

            for (int i = 1; i < 10; i++) {
                System.out.print("[" + i + "]");
                if (i == 3 || i == 6) {
                    System.out.println();
                }
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = '_';
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }while (false);
        Scanner sc = new Scanner(System.in);
        int count = 0, variation = 0;
        boolean bool = true;
        do {
            if (count == 0 || count % 2 == 0){
                System.out.println("x:");
                variation = sc.nextInt();
                switch (variation){
                    case 1: arr[0][0] = 'x';
                        break;
                    case 2: arr[0][1] = 'x';
                        break;
                    case 3: arr[0][2] = 'x';
                        break;
                    case 4: arr[1][0] = 'x';
                        break;
                    case 5: arr[1][1] = 'x';
                        break;
                    case 6: arr[1][2] = 'x';
                        break;
                    case 7: arr[2][0] = 'x';
                        break;
                    case 8: arr[2][1] = 'x';
                        break;
                    case 9: arr[2][2] = 'x';
                        break;
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
                }else if (count % 2 != 0){
                System.out.println("0:");
                variation = sc.nextInt();
                switch (variation){
                    case 1: arr[0][0] = '0';
                        break;
                    case 2: arr[0][1] = '0';
                        break;
                    case 3: arr[0][2] = '0';
                        break;
                    case 4: arr[1][0] = '0';
                        break;
                    case 5: arr[1][1] = '0';
                        break;
                    case 6: arr[1][2] = '0';
                        break;
                    case 7: arr[2][0] = '0';
                        break;
                    case 8: arr[2][1] = '0';
                        break;
                    case 9: arr[2][2] = '0';
                        break;
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
                }
            
                
            if (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' || arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ||
                    arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' || arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x'
                    || arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' || arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x'
                    || arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' || arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'){
                System.out.println("X win");
                bool = false;
            }else if (arr[0][0] == '0' && arr[0][1] == '0' && arr[0][2] == '0' || arr[1][0] == '0' && arr[1][1] == '0' && arr[1][2] == '0' ||
                    arr[2][0] == '0' && arr[2][1] == '0' && arr[2][2] == '0' || arr[0][0] == '0' && arr[1][1] == '0' && arr[1][2] == '0' ||
                    arr[0][2] == '0' && arr[1][1] == '0' && arr[2][0] == '0' || arr[0][2] == '0' && arr[1][2] == '0' && arr[2][2] == '0' ||
                    arr[0][0] == '0' && arr[1][0] == '0' && arr[2][0] == '0' ||arr[0][1] == '0' && arr[1][1] == '0' && arr[2][1] == '0'){
                System.out.println("0 win");
                bool = false;
            }

        count++;
            if (count==8){
                System.out.println("Nobody won!");
                bool = false;
            }
        }while (bool);

    }
}