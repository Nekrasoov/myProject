package lr4;
import java.util.Random;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(99);
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = id.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = id.nextInt();
        int array1[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                array1[i][j] = random.nextInt(99);
                System.out.println("i = "+i+"; j= "+j+"; Число="+array1[i][j]);
            }
        }
        System.out.println("");

        int deleteS = random.nextInt(a-1);
        int deleteK = random.nextInt(b-1);

        System.out.println("Удалена строка: "+(deleteS)+"; Удален столбец: "+(deleteK));
        System.out.println("");

        int array2[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        array2[i][j] = array1[s][k];
                        System.out.println("i = " + i + "; j= " + j + "; Число=" + array2[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}


//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел.