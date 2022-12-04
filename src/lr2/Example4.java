package lr2;

import java.util.Scanner;

public class Example4 {
//    Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");

        int x = in.nextInt();

        if ((x >= 5) && (x <= 10)) {
            System.out.println("Число попадает в выбранный диапазон");
        } else {
            System.out.println("Число не попадает в выбранный диапазон");
        }
        in.close();
    }
}
