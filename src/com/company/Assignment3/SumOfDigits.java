package com.company.Assignment3;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sumOfDigits = 0;

        while(number != 0){

            int digits = number % 10;
            sumOfDigits += digits;
            number /= 10;

        }

        System.out.println("The Sum is: " + sumOfDigits);



    }

}
