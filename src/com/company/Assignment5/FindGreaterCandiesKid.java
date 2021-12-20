package com.company.Assignment5;

import java.util.ArrayList;

public class FindGreaterCandiesKid {

    public static void main(String[] args) {

        int[] candies = {12,1,12};

        int extraCandies = 1;

        ArrayList<Boolean> list = kidsWithCandies(candies, extraCandies);

        System.out.println(list);



    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> resultList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {

            if(candies[i] > max){

                max = candies[i];

            }

        }

        for (int i = 0; i < candies.length; i++) {

            if (((candies[i] + extraCandies) >= max)) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }


        }

        return resultList;


    }






}
