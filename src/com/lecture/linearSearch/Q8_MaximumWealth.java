package com.lecture.linearSearch;
/*  https://leetcode.com/problems/richest-customer-wealth/ */
public class Q8_MaximumWealth {

    public static void main(String[] args) {

//        int[][] accounts = {{1,2,3},{3,2,1}};
//        int[][] accounts = {{1,5},{7,3},{3,5}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int[] bank:accounts) {
            int sum = 0;
            for (int money:bank) {

                sum += money;

            }

            if (sum > maxWealth){
                maxWealth = sum;
            }



        }

        return maxWealth;
    }
}
