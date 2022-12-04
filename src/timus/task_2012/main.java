package timus.task_2012;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = 4*60/45;

        if  ((a < 1) || (a > 11)) {
            System.out.println("Incorrect");
        } else if (a + b >= 12) {
            System.out.println("YES");
        } else if (a + b < 12) {
            System.out.println("NO");
        }
        in.close();
    }
}
