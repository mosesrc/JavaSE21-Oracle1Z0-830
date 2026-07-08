package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numArr = new int[5]; // it can hold 5 elements

        numArr[0] = -5;
        numArr[1] = -4;
        numArr[2] = 7;
        numArr[3] = 2;
        numArr[4] = -3;

        int result = numArr[0] + numArr[1] + numArr[2] + numArr[3] + numArr[4];

        System.out.println("Result: " + result);
        System.out.println("numArr: " + Arrays.toString(numArr));
        System.out.println("Length of the numArr: " + numArr.length);


        int[] numArr2 = {1, 2, 3};
        System.out.println("Before altering: " + Arrays.toString(numArr2));
        numArr2[1] = 8;
        System.out.println("After altering: " + Arrays.toString(numArr2));

        int[] ages = new int[]{15, (int)16.5, 5, 17};
        System.out.println("Ages: " + Arrays.toString(ages));


    }
}
