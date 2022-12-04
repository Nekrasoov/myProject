package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        1. Напишите программу, которая проверяет, делится ли введенное
//Пользователем число на 3

        Scanner in = new Scanner (System.in);

        System.out.println("Введите любое целое число:");
        int a = in.nextInt();

        int result = a % 3;

        System.out.println("Остаток от деления = " + result);

        if (result == 0) {
            System.out.println("Введенное число делится на 3 без остатка");
        } else {
            System.out.println("Введенное число не делится на 3 без остатка");
        }

    }
}
