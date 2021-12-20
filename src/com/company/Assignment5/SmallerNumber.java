package com.company.Assignment5;

import java.util.Arrays;

public class SmallerNumber {

    public static void main(String[] args) {
        int[] nums = {7,7,7,7};

        int[] result = findSmallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(result));
    }

    static int[] findSmallerNumbersThanCurrent(int[] nums) {


        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if(nums[j] < nums[i]){
                    count++;

                }

            }
            result[i] = count;


        }

        return result;

    }
}
