package Vlad.MyProject;

import java.util.Scanner;

/**
 * Created by Гудвін on 28.07.2016.
 */
public class calcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first, second;
        String operator;
        System.out.print("Enter operation: ");
        operator = sc.nextLine();
        System.out.print("Enter first value: ");
        first = sc.nextInt();
        System.out.print("Enter second value: ");
        second = sc.nextInt();

        int result;
        switch (operator){
            case "+":result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":result = first - second;
                System.out.println(first + " - " + second + " = "  + result);
                break;
            case "*":result = first * second;
                System.out.println(first + " * " + second + " = "  + result);
                break;
            case "/":result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;
            case "%":result = first % second;
                System.out.println(first + " % " + second + " = "  + result);
                break;
            default:
                System.out.println("False operator!");
                break;
        }

    }
}