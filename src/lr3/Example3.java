package lr3;

public class Example3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;

        System.out.print( a + " " +b+ " ");
        for (int i = 3; i <= 11; i++) {

            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        int x = 1;
        int y = 1;
        int z;

        System.out.print(x+" " +y+ " ");
        do {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        } while (z <= 88);

        System.out.println();
    }
}

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.