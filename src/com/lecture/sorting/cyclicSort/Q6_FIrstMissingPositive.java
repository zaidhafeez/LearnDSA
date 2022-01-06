package com.lecture.sorting.cyclicSort;

public class Q6_FIrstMissingPositive {

    public static void main(String[] args) {

//        int[] nums = {1,2,0};
//        int[] nums = {3,4,-1,1};
        int[] nums =  {7,8,9,11,12};
        cyclicSort(nums);

        System.out.println(firstMissingPositive(nums));

    }

    static void cyclicSort(int[] nums) {

        int i = 0;
        while(i < nums.length){

            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
            else i++;

        }


    }

    static int firstMissingPositive(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i + 1) return i + 1;

        }

        return nums.length + 1;

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
