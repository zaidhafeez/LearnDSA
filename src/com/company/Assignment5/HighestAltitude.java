package com.company.Assignment5;


import java.util.Arrays;
import java.util.Scanner;

public class HighestAltitude {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();

//        int[] gain = {-4,-3,-2,-1,4,3,2};
            int[] gain = {-5,1,5,0,-7};
//        int[] gain = new int[size];

//        for (int i = 0; i < gain.length; i++) {
//
//            gain[i] = in.nextInt();
//
//        }

        int res = findHighestAltitude(gain);

        System.out.println(res);

    }

    static int findHighestAltitude(int[] gain) {

        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int i = 1;
        while(i < altitude.length){

            altitude[i] = altitude[i - 1] + gain[i - 1];
            i++;

        }
        int highestAltitude = findMax(altitude);

        return highestAltitude;

    }

    static int findMax(int[] altitude) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < altitude.length; i++) {

                if(altitude[i] > max){
                    max = altitude[i];
                }

        }

        return max;

    }

    // 2nd way //
//    int max = 0;
//    int sum = 0;
//        for(int i=0;i<gain.length;i++){
//        sum = sum + gain[i];
//        if(sum>max)
//            max=sum;
//    }
//        return max;

}
