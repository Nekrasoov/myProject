package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int G = in.nextInt();;
        int L = in.nextInt();;


        int resultG = (G + L - 1) - G;
        int resultL = (G + L - 1) - L;

        out.print(resultG + " " + resultL);
        out.flush();
    }
}

