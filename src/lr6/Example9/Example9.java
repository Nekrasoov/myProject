package lr6.Example9;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        char[] charArray = {'п', 'р', 'и',  'в', 'е', 'т'};
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(hangOutArray(charArray)));

    }
    static char[] hangOutArray(char[] someArray){
        int lengthArray = someArray.length;
        char[] resultArray = new char[lengthArray];
        for (int i = 0; i <= ((lengthArray) / 2); i++){
            resultArray[lengthArray - 1] = someArray[i];
            resultArray[i] = someArray[lengthArray - 1];
            lengthArray--;
        }
        return resultArray;
    }
}

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.