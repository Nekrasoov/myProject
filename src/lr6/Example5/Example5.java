package lr6.Example5;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для которого мы рассчитаем сумму квадратов: ");
        int inputValue = in.nextInt();
        System.out.println("Сумма квадрата натуральных чисел " + inputValue + "равна: " + summSquare(inputValue));
    }

    static int summSquare(int a){
        int result = 0;
        for (int i = 1; i <= a; i++){
            result = result + (i * i);
        }
        return result;
    }
}

//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 1
//2 + 22 + 32 + ... + п
//2
//. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 12 + 22 +3
//2+…+n
//2=
//(n+l) (2n + 1)/6