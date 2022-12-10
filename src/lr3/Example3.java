package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите колл-во чисел");

        int one = in.nextInt();
        int [] two = new int[one];

        int a = 1;
        int b = 1;
        int c;

        System.out.print( a + " " +b+ " ");
        for (int i = 3; i <= two.length; i++) {

            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        int x = 1;
        int y = 1;
        int z = 0;

        int three = 0;

        if (one == 1)  {
            System.out.println(x);
        } else if (one == 2) {
            System.out.println(x+ " " +y);
        } else if (one >= 3) {
            System.out.print(x+" " +y+ " ");
            while (three < (one -2)) {
                z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
                three++;
            }
        } else {
            System.out.println("Введите число больше 0");
        }
    }
}

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.