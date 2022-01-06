package com.lecture.sorting.cyclicSort;

import java.util.Arrays;

public class Q5_SetMisMatch {

    public static void main(String[] args) {

//        int[] nums = {1,2,2,4};
        int[] nums = {3,2,2};
        cyclicSort(nums);
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    static int[] findErrorNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i + 1) return  new int[] {nums[i], i+1};

        }

        return new int[] {-1,-1};

    }

    private static void cyclicSort(int[] nums) {

        int i = 0;
        while (i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) swap(nums,i,correct);
            else i++;

        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
