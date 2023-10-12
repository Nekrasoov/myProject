package timus.task_1264;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in, StandardCharsets.ISO_8859_1);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.ISO_8859_1));
        int N,M;
        N=in.nextInt();
        M=in.nextInt();
        in.close();
        int time = N*(M+1);

        System.out.print(time);
        out.flush();
    }
}