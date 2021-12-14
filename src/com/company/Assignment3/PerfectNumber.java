package com.company.Assignment3;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0){

                sum += i;

            }

        }

//        if(number == sum){
//            System.out.println("This is a perfect number : " + sum);
//        }
        System.out.println((number == sum) ? ("perfect number " + sum): "not perfect");

    }

}
