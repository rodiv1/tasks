package Vlad.course.lesson3.hometask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Гудвін on 02.08.2016.
 */
public class task03 {
    public static void main(String[] args) {
        byte dig, err = 0;
        char [] s = new char[10];
        int rand, ag = 1;
        Scanner sel = new Scanner(System.in);
        Scanner again = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Number of cell:");
        System.out.println("7 | 8 | 9");
        System.out.println("4 | 5 | 6");
        System.out.println("1 | 2 | 3");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        while((ag == 1) || (ag == 1)) {

            do {
                System.out.println("Enter number of cell: ");
                err = 0;
                dig = sel.nextByte();
                if ((dig < 0) || (dig > 10)) System.out.println("Enter valid value!!!");
                if (s[dig] != '\u0000') {err = 1; System.out.println("Enter free cell!!!");}

            }while ((dig < 0) || (dig > 10) || (err != 0));

            s[dig] = 'X';

            do{
                rand = r.nextInt(9) + 1;
                if ((s[rand] != '\u0000') || (rand == 10)) err = 2; //ошибка, если ячейка занята
                else {s[rand] = 'O'; err = 0;}
            }while (err != 0);

            System.out.println(s[7] + " | " + s[8] + " | " + s[9]);
            System.out.println(s[4] + " | " + s[5] + " | " + s[6]);
            System.out.println(s[1] + " | " + s[2] + " | " + s[3]);
            System.out.println(" ");
            System.out.println(" ");

            if (((s[1] == 'X') && (s[2] == 'X') && (s[3] == 'X')) || ((s[4] == 'X') && (s[5] == 'X') && (s[6] == 'X')) || ((s[7] == 'X') && (s[8] == 'X') && (s[9] == 'X')) || ((s[1] == 'X') && (s[5] == 'X') && (s[9] == 'X')) || ((s[3] == 'X') && (s[5] == 'X') && (s[7] == 'X'))) // X
            {
                System.out.println("You WIN!!!");
                System.out.println("Again? (1 = yes/0 = no)");
                ag = again.nextByte();
                if (ag == 0 || ag == 0)
                    break;
                else
                {
                    ag = 1;
                    Arrays.fill(s, '\u0000');

                }
            }

            if (((s[1] == 'O') && (s[2] == 'O') && (s[3] == 'O')) || ((s[4] == 'O') && (s[5] == 'O') && (s[6] == 'O')) || ((s[7] == 'O') && (s[8] == 'O') && (s[9] == 'O')) || ((s[1] == 'O') && (s[5] == 'O') && (s[9] == 'O')) || ((s[3] == 'O') && (s[5] == 'O') && (s[7] == 'O'))) // O
            {
                System.out.println("You LOSE!!!");
                System.out.println("Again? (1 = yes/0 = no)");
                ag = again.nextByte();
                if (ag == 0 || ag == 0) {
                    break;
                }
                else
                {
                    ag = 1;
                    Arrays.fill(s, '\u0000');
                }

            }

            if ((s[1] != '\u0000') && (s[2] != '\u0000') && (s[3] != '\u0000') && (s[4] != '\u0000') && (s[5] != '\u0000') && (s[6] != '\u0000') && (s[7] != '\u0000') && (s[8] != '\u0000') && (s[9] != '\u0000')){
                System.out.println("Dead heat!!!");
                System.out.println("Again? (1 = yes/0 = no)");
                ag = again.nextByte();
                if (ag == 0 || ag == 0) {
                    break;
                }
                else
                {
                    ag = 1;
                    Arrays.fill(s, '\u0000');
                }
            }
        }
    }
}