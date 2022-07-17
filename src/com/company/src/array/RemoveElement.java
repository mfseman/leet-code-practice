package com.company.src.array;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            // Shift each element one position to the left
            // 1, 0, 2, 5, 5, 7
            if (nums[i] == val) {
                nums[i] = nums[i + 1];
            }
        }
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
