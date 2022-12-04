package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
//        Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1.

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");

        int x = in.nextInt();

        int resultA = x % 5;
        System.out.println("Остаток от деления на 5 = " +resultA);

        int resultB = x % 7;
        System.out.println("Остаток от деления на 7 = " +resultB);

        if ((resultA == 2) && (resultB == 1)) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}
