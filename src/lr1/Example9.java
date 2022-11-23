package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String mounth = in.nextLine();

        System.out.println("Введите колличество дней: ");
        int days = in.nextInt();

        System.out.printf("В месяце %s %d дня!", mounth, days);
        in.close();
    }
}
