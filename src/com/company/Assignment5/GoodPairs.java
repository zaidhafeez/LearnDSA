package com.company.Assignment5;

public class GoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int noOfGoodPairs = findNoOfGoodPairs(nums);
        System.out.println(noOfGoodPairs);

    }

    static int findNoOfGoodPairs(int[] nums) {


        int count = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if(nums[i] == nums[j]){
//
//                    count++;
//
//                }
//            }
//
//        }

//        return count;

        // 2nd way //

        for (int i = 0; i < nums.length; i++) {

            int j = nums.length -1;

            while(i < j){

                if(nums[i] == nums[j]){

                    count++;

                }

                j--;

            }

        }
        return count;


    }

    // 3r way //
//    public int numIdenticalPairs(int[] A) {
//        int res = 0, count[] = new int[101];
//        for (int a: A) {
//            res += count[a]++;
//        }
//        return res;
//    }

}
