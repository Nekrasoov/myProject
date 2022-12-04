package lr2;

import java.util.Scanner;

public class Example5 {
//    Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");

        int x = in.nextInt();

        int result = x / 1000;

        System.out.println("В вашем числе колличество тысяч = " +result%10 );

    }
}
