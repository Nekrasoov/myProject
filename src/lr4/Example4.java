package lr4;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер прямоугольника:");
        int size = in.nextInt();
        char [][] symbol = new char [size][];

        for (int i=0;i<symbol.length; i++){
            int j = i+1;
            symbol[i] = new char[j];
        }

        for (int i=0; i<size; i++){
            for (int j=0; j<i+1;j++) {
                symbol[i][j] = '*';
            }
        }

        for (int i =0; i < size; i++){
            for (int j = 0; j < symbol[i].length; j++){
                System.out.print(symbol[i][j]+" ");
            }
            System.out.println("");
        }

    }
}


//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;