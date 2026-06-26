package com.attila.taskmanager.arrays;

import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};

        int[] numsTwo = {1, 2, 3, 4};

        System.out.println(hasDuplicate(nums));
        System.out.println(hasDuplicate(numsTwo));

    }

    public static boolean hasDuplicate(int[] nums) {

        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            if (!unique.add(num)) {
                return true;
            }
        }
        return false;
    }
}
