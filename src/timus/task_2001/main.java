package timus.task_2001;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

//        b1 - вес ягод первого математика с корзиной
//        b2 - вес корзины
//        x - вес ягод первого математика
//        b3 - вес с корзиной, с ягодами первого математика и ягодами второго

        int x = b1 - b2;
        int y = b3 - x - b2;

        System.out.println(y + " " + x);
    }
}
