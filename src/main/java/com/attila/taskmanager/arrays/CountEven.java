package com.attila.taskmanager.arrays;

public class CountEven {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(countEven(nums));

    }

    public static int countEven (int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
