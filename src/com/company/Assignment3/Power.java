package com.company.Assignment3;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number  = in.nextInt();
        int power = in.nextInt();
        int answer = powerOfNumber(number,power);
        System.out.println(answer);

//        while(power != 0){
//
//            answer *= number;
//            power--;
//
//
//        }
//        System.out.println("The power of number is: " + answer);

    }

    // 2nd Solution using Recursion //

    static int powerOfNumber(int number, int power){

        if(power < 1) return 1;


        return number * powerOfNumber(number, power - 1);


    }

}
