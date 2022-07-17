package com.company.src.array;

import java.util.Arrays;

// Square each value in the array, then sort the array.
public class SquaredSortedArray {
    public int[] sortedSquares(int[] nums) {
        int counter = 0;
        for (int value : nums) {
            nums[counter] = (int) Math.pow(value, 2);
            counter++;
        }
        Arrays.sort(nums);
        return nums;
    }
}