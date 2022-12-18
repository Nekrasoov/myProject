package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ширину: ");
        int w = in.nextInt();

        System.out.println("Введите высоту");
        int h = in.nextInt();

        int [] [] a = new int [h][w];

        int b = 0;

        int c;

        for (int i=0; i <h; i++ ){
            for (int j = 0; j < w; j++){
                a[i][j] = 2;
            }
        }

        for (int i =0; i < h; i++){
            c = i+1;
            System.out.print( c + " номер строки ");
            for (int j = 0; j <w; j++){
                System.out.print(a[i][j]+" ");
                b++;
            }
            System.out.println(" Количество символов в строке " + b);
            b = 0;
        }

    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2;