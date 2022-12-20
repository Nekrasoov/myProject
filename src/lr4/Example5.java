package lr4;
import java.util.Random;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);//
        System.out.print("Введите количество  столбцов: ");
        int a = id.nextInt();
        System.out.print("Введите количество строк: ");
        int b = id.nextInt();
        Random random = new Random(99);

        int array1 [][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                array1[i][j] = random.nextInt(99);
                System.out.println("i = "+i+"; j= "+j+"; Число= "+array1[i][j]);
            }
        }
        System.out.println("");

        int array2[][] = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                array2[i][j] = array1[j][i];
                System.out.println("i = "+i+";j= "+j+"; Число= "+array2[i][j]);
            }
        }
    }
}

//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строки и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.