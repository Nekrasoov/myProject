package lr6.Example10;

import java.util.Arrays;

public class Example10 {

    public static void main(String[] args) {
        int[] arrayInt = getMaxAndMinValue(123, 10,20, 23, 30, 522, 100,500,1243);
        Arrays.toString(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMaxAndMinValue(int ... v) {
        Arrays.sort(v);

        int[] arrayInt = new int[2];
        arrayInt[1] = v[v.length-1];
        arrayInt[0] = v[0];
        return arrayInt;
    }
}
