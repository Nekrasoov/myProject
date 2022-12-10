package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        System.out.println("Размер массива = " + size);

        char a = 97;
        System.out.println(a);
        for (char i=a; i <= size; i+=2) {
            System.out.println(+i);
        }
    }
}

//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.