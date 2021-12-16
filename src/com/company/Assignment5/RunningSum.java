package com.company.Assignment5;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for (int i = 0; i < nums.length; i++) runningSum[i] = runningSum[i - 1] + nums[i];

        return runningSum;

//        int i = 1;
//        while (i<nums.length){
//            nums[i]+=nums[i-1];
//            i++;
//        }
//        return nums;

    }

}
