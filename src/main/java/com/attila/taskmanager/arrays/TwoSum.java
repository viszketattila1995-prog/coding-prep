package com.attila.taskmanager.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));

        System.out.println(Arrays.toString(twoSum2(nums, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int num1;
        int num2;

        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                num2 = nums[j];

                if (num1 + num2 == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];   //2
            int complementer = target - current;  //7

            if (integerMap.containsKey(complementer)) {
                return new int[] {integerMap.get(complementer), i};
            } else {
                integerMap.put(current, i);
            }
        }
        return new int[0];
    }
}
