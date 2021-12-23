package com.company.Assignment5;

public class Q19_MaximumPopulation {

    public static void main(String[] args) {

        int[][] logs = {{1993,1999},{2000,2010}};

        int[] year = new int[101];

        for (int[] log:logs) {

            year[log[0] - 1950] += 1;
            year[log[1] - 1950] += -1;

        }

        int maxNum = year[0];
        int maxYear = 1950;

        for (int i = 1; i < year.length; i++) {

            year[i] += year[i-1];
            if(year[i] > maxNum){

                maxNum = year[i];
                maxYear = i + 1950;

            }
            
        }

        System.out.println(maxYear);

    }

}
