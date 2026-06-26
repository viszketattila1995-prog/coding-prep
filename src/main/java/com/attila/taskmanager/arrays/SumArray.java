package com.attila.taskmanager.arrays;

public class SumArray {

    public static void main(String[] args) {

        int[] arrayList = {1, 3, 5, 9};

        System.out.println(sumArray(arrayList));

        System.out.println(sumArrayTwo(arrayList));

    }

    public static int sumArray(int[] input) {
        int num = 0;

        for (int i = 0; i < input.length; i++) {
            num = num + input[i];
        }
        return num;
    }

    public static int sumArrayTwo(int[] input) {
        int sum = 0;

        for (int number : input) {
            sum = sum + number;
        }
        return sum;
    }
}
