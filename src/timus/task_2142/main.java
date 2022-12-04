package timus.task_2142;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        земли
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        мана на заклинание
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
//       мана на руках после изучения
        int d = Math.abs(x - a);
        int e = Math.abs(y - b);
        int f = c;

        System.out.printf("%d %d %d", d, e, f);





//        if ((x - d <=0) && (y - e <= 0) && (z - f <= 0)) {
//            System.out.println("It is a kind of magic");
//        } else {
//            System.out.println("There are no miracles in life");
//        }


    }
}
