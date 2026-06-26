package com.attila.taskmanager.arrays;

public class SumArray {

    public static void main(String[] args) {

        int[] arrayList = {1, 3, 5, 9};

        System.out.println(sumArray(arrayList));

    }

    public static int sumArray(int[] input) {
        int num = 0;

        for (int i = 0; i < input.length; i++) {
            int numAtI = input[i];
            num = num + numAtI;
        }
        return num;
    }
}
