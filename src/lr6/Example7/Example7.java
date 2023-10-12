package lr6.Example7;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {

        char[] charArray = {'п', 'о', 'к', 'а', '!'};
        int[] result = checkCodeChar(charArray);
        System.out.println("Массив: " + Arrays.toString(result));
    }

    static int[] checkCodeChar(char[] someArray){
        int[] resultArray = new int[someArray.length];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = (int) someArray[i];
        }

        return resultArray;
    }
}

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.