package com.company.Assignment3;

import java.util.Scanner;

public class Hcf {

    public static void main(String[] args) {


        // Euclid Algorithm says that if you have two numbers and you subtract he smaller number with larger number you end with the hcf

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int hcf = 0;

        while( number1 != number2){

            if(number1 > number2){

                number1 = number1 - number2;

            }
            if (number2 > number1){
                number2 = number2 - number1;
            }

        }
        hcf = number1; // or you can use number 2
        System.out.println("The hcf of number is : " + hcf);

    }

}
