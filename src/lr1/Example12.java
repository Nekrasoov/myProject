package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in.nextInt();

        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        int c = a + b;

        System.out.printf("%d + %d = %d ", a, b, c);
        in.close();
    }
}