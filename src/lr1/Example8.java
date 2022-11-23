package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        int day = in.nextInt();

        System.out.println("Input month: ");
        int month = in.nextInt();

        System.out.println("Input year: ");
        int year = in.nextInt();

        System.out.printf("Day: %d  Month: %d  Year: %d", day, month, year);
        in.close();
    }
}
