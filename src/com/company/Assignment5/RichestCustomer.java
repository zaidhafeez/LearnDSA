package com.company.Assignment5;

public class RichestCustomer {

    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {7,1,3},{1,9,5}};
        int maxVal = maximumWealth(accounts);

        System.out.println(maxVal);

    }

    static int maximumWealth(int[][] accounts){

        int max = Integer.MIN_VALUE;

//        for (int i = 0; i < accounts.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < accounts[i].length; j++) {
//
//                sum += accounts[i][j];
//            }
//            if(sum > max){
//                max = sum;
//            }
//
//        }

        for(int[] i: accounts){

            int sum = 0;
            for (int j : i){
                sum += j;
            }
            if(sum > max){
                max = sum;
            }
        }

        return max;

    }

    // 2nd way //

//    static int maximumWealth(int[][] accounts) {
//        int maxWealth = Integer.MIN_VALUE;
//        for (int[] account : accounts) {
//            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
//        }
//        return maxWealth;
//    }
//

}
