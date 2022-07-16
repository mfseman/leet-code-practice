package com.company.array;

public class MaxConsecutiveOnes {

//    Given a binary array nums, return the maximum number of consecutive 1's in the array.
//    Input: nums = [1,1,0,1,1,1]
//    Output: 3
//    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int result = 0;

        for (int num : nums) {
            if (num == 0) {
                maxConsecutive = 0;
            } else {
                maxConsecutive++;
                result = Math.max(result, maxConsecutive);
            }
        }
        return result;
    }
}