package array;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        System.out.println("---------------------- Sorting Double Array ---------------------------");

        // Sorting double array
        double[] arr1 = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
        System.out.println("unsorted array: " + Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("sorted array: " + Arrays.toString(arr1));


        System.out.println("---------------------- Sorting Int Array ---------------------------");

        // Sorting double array
        int[] arr2 = {1, 3, -5, 10, 2, 15, 9};
        System.out.println("unsorted array: " + Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println("sorted array: " + Arrays.toString(arr2));


        System.out.println("---------------------- Sorting Char Array ---------------------------");

        // Sorting double array
        char[] arr3 = {'F', 'B', 'b', 'H', 'c', 'A'};
        System.out.println("unsorted array: " + Arrays.toString(arr3));

        Arrays.sort(arr3);
        System.out.println("sorted array: " + Arrays.toString(arr3));


        System.out.println("---------------------- Sorting String Array ---------------------------");

        // Sorting double array
        String[] arr4 = {"cat", "Dog", "Monkey", "Lion", "elephant", "Cow"};
        System.out.println("unsorted array: " + Arrays.toString(arr4));

        Arrays.sort(arr4);
        System.out.println("sorted array: " + Arrays.toString(arr4));


        System.out.println("---------------------- Sorting String Array2 ---------------------------");

        // Sorting double array
        String[] arr5 = {"3", "300", "20", "35", "37", "31", "4", "70", "ant", "Zebra"};
        System.out.println("unsorted array: " + Arrays.toString(arr5));

        Arrays.sort(arr5);
        System.out.println("sorted array: " + Arrays.toString(arr5));
    }
}
