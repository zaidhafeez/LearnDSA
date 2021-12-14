package com.company.Assignment3;

import java.util.Scanner;

public class ListSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumOfNegativeNumbers = 0;

        int sumOfPositiveEvenNumbers = 0;

        int sumOfPositiveOddNumbers = 0;



        while(true){

            int number = in.nextInt();

            if(number == 0) break;

            if(number < 0){

                sumOfNegativeNumbers += number;

            }
            else{

                if(number % 2 == 0){

                    sumOfPositiveEvenNumbers += number;

                }
                else{

                    sumOfPositiveOddNumbers += number;

                }

            }

        }

        System.out.println("The Sum of Negative Numbers: " + sumOfNegativeNumbers);
        System.out.println("The Sum of Positive Even Numbers: " + sumOfPositiveEvenNumbers);
        System.out.println("The Sum of Positive Odd Numbers: " + sumOfPositiveOddNumbers);

    }

}
