package lr5.Example3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый аргумент: ");
        int int1 = in.nextInt();
        System.out.println("Введите второй аргумент: ");
        int int2 = in.nextInt();

        Main main1 = new Main();
        Main main2 = new Main(int1);
        Main main3 = new Main(int1,int2);
    }
}

//3. Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.