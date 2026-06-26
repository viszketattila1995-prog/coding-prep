package com.attila.taskmanager.arrays;

public class FindMax {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        System.out.println(findMax(numbers));
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
