package com.company.Assignment3;

import java.util.Scanner;

public class Lcm {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int max = (number1 > number2) ? number1 : number2;

        while(true){

            if (max % number1 == 0 && max % number2 == 0) {

                System.out.println("The LCM is: " + max);
                break;

            }
            max++;
        }
    }
}
