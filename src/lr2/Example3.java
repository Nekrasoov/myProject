package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

//        Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10.

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число");

        int x = in.nextInt();

        int result = x % 4;

        System.out.println("Остаток от деления = " +result);

        if ((result == 0) && (x > 10)) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}
