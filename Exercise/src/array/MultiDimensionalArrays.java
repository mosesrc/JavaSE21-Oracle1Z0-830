package array;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2D Array
        int[][] twoDimArray = new int[3][3];
        twoDimArray[0][0] = 0;
        twoDimArray[0][1] = 1;
        twoDimArray[0][2] = 2;
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 4;
        twoDimArray[1][2] = 5;
        twoDimArray[2][0] = 6;
        twoDimArray[2][1] = 7;
        twoDimArray[2][2] = 8;

        System.out.println("twoDimArray: " + Arrays.toString(twoDimArray));
        System.out.println(Arrays.toString(twoDimArray[0]));
        System.out.println(Arrays.toString(twoDimArray[1]));
        System.out.println(Arrays.toString(twoDimArray[2]));

        System.out.println("-----------------------------------------------------");

        int[][] ages = {
                {5, 20},
                {25, 26, 27},
                {30}
        };

        System.out.println("ages: " + Arrays.toString(ages));
        System.out.println(Arrays.toString(ages[0]));
        System.out.println(Arrays.toString(ages[1]));
        System.out.println(Arrays.toString(ages[2]));

        // 3D array
        char[][][] threeDimArray = {
                {
                        {'a', 'b', 'c'},
                        {'d', 'e'}
                },
                {
                        {'f', 'g'},
                        {'h'},
                        {'i', 'j', 'k', 'l'}
                },
        };

        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0]));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1]));

        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0][0]));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[0][1]));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][0]));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][1]));
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray[1][2]));

    }
}
