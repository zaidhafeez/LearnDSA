package com.lecture.sorting.cyclicSort;

public class Q3_FindDuplicates {

    public static void main(String[] args) {
//       int[] nums =  {1,3,4,2,2};

        int[] nums = {3,1,3,4,2};
        System.out.println(getDuplicateElement(nums));

    }

    static int getDuplicateElement(int[] nums) {

        int i = 0;
        while(i < nums.length) {

            int element = nums[i];
            int correctIndex = nums[i] - 1;

            if(element != i + 1){

                if(nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
                else return nums[i];

            }
            else i++;
        }
        return Integer.MIN_VALUE;
    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
