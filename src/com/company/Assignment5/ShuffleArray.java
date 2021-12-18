package com.company.Assignment5;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));

    }

    static int[] shuffle(int[] nums, int n){

        int[] result = new int[nums.length];
        int j = n;
        int index = 0;

        for (int i = 0; index < nums.length; i++){

            result[index++] = nums[i];
            result[index++] = nums[j];
            j++;

        }

        return result;

    }

//    static void swap(int[] nums, int i, int j) {
//
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[i+1] = temp;
//
//    }

}
