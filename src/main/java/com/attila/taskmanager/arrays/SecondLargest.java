package com.attila.taskmanager.arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] array = {3, 7, 2, 9, 4};

        int[] arrayTwo = {3, 9, 7};

        System.out.println(secondLargest(array));
        System.out.println(secondLargest(arrayTwo));

    }

    public static int secondLargest(int[] input) {

        int first = input[0];
        int second = Integer.MIN_VALUE;

        for (int i : input) {
            if (i > first) {
                second = first;
                first = i;
            } else if (first > i && i > second) {
                second = i;
            }
        }
        return second;
    }

}
