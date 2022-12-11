package lr3;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(25);
        int[] nums = new int[a];


        for (int i = 0; i < a; i++) {
            nums[i] = random.nextInt(200);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        Arrays.sort(nums);

        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length ; i++){
            System.out.print( nums[i] + " ");
        }
        System.out.println();

        System.out.println("Произведена сортировка массива в порядке убывания");

        int[] nums2 = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(nums2));

//        Подсмотрел в интернете

    }
}

//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений.