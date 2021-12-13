package com.company;

//import Assignment2.util.Scanner;

public class VarAgrgs {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

//        int number  = in.nextInt();

        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }



    }

    static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= number) {

            if (number % c == 0) {
                return false;
            }
            c++;
        }

        return c * c > number;

    }


}
