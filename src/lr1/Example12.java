package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите возраст: ");
        int age = in.nextInt();

        int year = 2022-age;
        System.out.printf("Ваш год рождения: %d", year);
        in.close();
    }
}
