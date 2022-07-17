package com.company.src.array;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] arraySize = new int[nums.length * 2];
        for (int i = 0, j = nums.length; i < nums.length; i++, j++) {
            arraySize[i] = nums[i];
            arraySize[j] = nums[i];
        }
        return arraySize;
    }
}
