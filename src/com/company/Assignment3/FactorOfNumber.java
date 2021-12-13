package com.company.Assignment3;

import java.util.Scanner;

public class FactorOfNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for(int i = 1; i <= number; i++){


            System.out.print((number % i == 0) ? (i + " ") : "");



        }


    }

}
