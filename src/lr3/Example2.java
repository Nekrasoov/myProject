package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели:");

        String day = in.nextLine();
        int dayNumber = 0;

        switch (day) {
            case "Понедельник":
            case "понедельник":
                dayNumber = 1;
                break;
            case "Вторник":
            case "вторник":
                dayNumber = 2;
                break;
            case "Среда":
            case "среда":
                dayNumber = 3;
                break;
            case "Четверг":
            case "четверг":
                dayNumber = 4;
                break;
            case "Пятница":
            case "пятница":
                dayNumber = 5;
                break;
            case "Суббота":
            case "суббота":
                dayNumber = 6;
                break;
            case "Воскресенье":
            case "воскресенье":
                dayNumber = 7;
                break;
            default: dayNumber =0;
        }

        if (dayNumber == 1 )  {
            System.out.println( "Порядковый номер дня недели: 1");
        } else if (dayNumber == 2) {
            System.out.println( "Порядковый номер дня недели: 2");
        } else if (dayNumber == 3) {
            System.out.println( "Порядковый номер дня недели: 3");
        } else if (dayNumber == 4) {
            System.out.println( "Порядковый номер дня недели: 4");
        } else if (dayNumber == 5) {
            System.out.println( "Порядковый номер дня недели: 5");
        } else if (dayNumber == 6) {
            System.out.println( "Порядковый номер дня недели: 6");
        } else if (dayNumber == 7) {
            System.out.println( "Порядковый номер дня недели: 7");
        } else {
            System.out.println("Такого дня нет");
        }
    }
}


//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.