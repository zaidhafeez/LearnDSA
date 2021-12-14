package com.company.Assignment4;

import java.util.Scanner;

public class FindMaxMin {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        System.out.println("The maximum element is : " + findMax(number1, number2, number3));
        System.out.println("The minimum element is : " + findMin(number1, number2, number3));

    }

//    static int findMax(int number1, int number2, int number3) {
//
//        if(number1 > number2){
//            if(number1 > number3){
//                return number1;
//            }
//            else{
//                return number3;
//            }
//        }
//        if (number2 > number1){
//            if (number2 > number3){
//                return number2;
//            }
//            else{
//                return number3;
//            }
//
//        }
//
//        return  0;
//
//    }

//    static int findMin(int number1, int number2, int number3) {
//
//        if(number1 < number2){
//            if(number1 < number3){
//                return number1;
//            }
//            else{
//                return number3;
//            }
//        }
//        if(number2 < number1){
//            if(number2 < number3){
//                return number2;
//            }
//            else{
//                return number3;
//            }
//
//        }
//
//        return 0;
//
//    }
     // 2nd Solution //
    static int findMax(int number1, int number2, int number3) {

        int max = number1;
        if(number2 > max){

            max = number2;

        }
        if(number3 > max){

            max = number3;

        }

        return max;


    }

    static int findMin(int number1, int number2, int number3) {

        int min = number1;
        if(number2 < min){

            min = number2;

        }
        if(number3 < min){

            min = number3;

        }

        return min;


    }

}
