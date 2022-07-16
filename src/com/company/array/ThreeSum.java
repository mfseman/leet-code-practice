package com.company.array;

import java.util.ArrayList;
import java.util.List;

public class    ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumSolution = new ArrayList<>();
        for(int x = 0; x < nums.length; x++) {
            for(int y = x+1; y < nums.length; y++){
                for(int z = y+1; y < nums.length; z++){
                    if(nums[x] + nums[y] + nums[z] == 0){
                        threeSumSolution.add(List.of(nums[x], nums[y], nums[z]));
                    }
                }
            }
        }
        return threeSumSolution;
    }
}
