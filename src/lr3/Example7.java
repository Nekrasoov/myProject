package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива = " + size);

        char[] large = new char[size];
        char a = 'a';
        for (char i = 0; i < large.length; i++) {
            large[i] = a++;
            a++;
            System.out.print(large[i] + " ");
        }
        System.out.println();
        for (int j = large.length-1; j >= 0; j--) {
            System.out.print(large[j] + " ");
        }

    }
}

//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.