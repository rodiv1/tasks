package Inet;

import java.util.Scanner;

/**
 * Created by Гудвін on 30.07.2016.
 */
public class Random {
    public static void main(String[] args) {
        // prog — число створене програмою
        // user — число введене користувачем
        // quantity - кульк
        int prog, user;
        // Генеруємо випадкове ціле число від 1 до 100
        prog = (int)(Math.random() * 100) + 1;
        System.out.println("Я загадав число від 1 до 100, відгадай його.");
        System.out.print("Введи своє число: ");
        Scanner input = new Scanner(System.in);
        // Перевіряємо, чи є число в тококі введення

            if (input.hasNextInt()) {
                do {
                    // Читаємо з потоку введення ціле число
                    user = input.nextInt();
                    if (user == prog) {
                        System.out.println("Ви відгадали!");
                    } else {
                        // Перевіряємо, чи входе число в відрізок [1;100]
                        if (user > 0 && user <= 100) {
                            System.out.print("Ви не відгадали! ");
                            // Якщо число загадане програмою менше...
                            if (prog < user) {
                                System.out.println("Моє число менше.");
                            } else {
                                System.out.println("Моє число більше.");
                            }
                        } else {
                            System.out.println("Ваше число вийшло за рамки допустимого діапазона(1-100)!");
                        }
                    }
                } while (user != prog);
                    System.out.println("Мої вітання!");
            } else {
                System.out.println("Помилка. Ви не ввели ціле число!");
            }
        }
    }
