package lr5.Example3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Main main1 = new Main();
        main1.int1 = 1;
        main1.int2 = 15;
        Main main2 = new Main(1);
        Main main3 = new Main(1,15);

        System.out.println(main1.int1+ " " +main1.int2);
        System.out.println(main2.int1+ " " +main2.int2);
        System.out.println(main3.int1+ " " +main3.int2);
    }
}

//3. Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.