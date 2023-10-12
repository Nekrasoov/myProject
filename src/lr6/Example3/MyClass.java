package lr6.Example3;

import java.util.Arrays;

public class MyClass {


    static void calcMax(int ... array){
            int max = array[0];
            for (int j : array) {
                max = Math.max(max, j);
            }
            System.out.println(max);
        }

    static void calcMin(int ... array){
            int min = array[0];
            for (int j : array) {
                min = Math.min(min, j);
            }
            System.out.println(min);
        }

    static void calcAvg(int ... array){
            int sum = 0;
            for (int j : array) {
                sum = j + sum;
            }
            double avg = (double)sum/array.length;
            System.out.println(avg);
        }
    }


//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.