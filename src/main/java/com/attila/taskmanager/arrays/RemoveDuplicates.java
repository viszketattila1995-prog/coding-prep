package com.attila.taskmanager.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3, 4};

        System.out.println(removedDuplicates(nums));

    }

    public static Set<Integer> removedDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            unique.add(num);
        }

        return unique;
    }
}
