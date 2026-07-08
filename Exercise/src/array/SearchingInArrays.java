package array;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {0, 2, 4, 6, 8, 10};
        int indexOfEight = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + indexOfEight);

        int indexOfSeven = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + indexOfSeven);

        int[] numbers1 = {0, 12, 4, 16, 18, 10};
        Arrays.sort(numbers1);
        int indexOfFour = Arrays.binarySearch(numbers1, 4);
        System.out.println("Index of four: " + indexOfFour);

        String[] animals = {"Cat", "Cow", "Dog", "Elephant", "Lion", "Monkey"};
        int indexOfDog = Arrays.binarySearch(animals, "Dog");
        System.out.println("Index of Dog: " + indexOfDog);

    }
}
