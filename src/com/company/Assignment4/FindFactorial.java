package com.company.Assignment4;

import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("The Factorial is: " + fact(number));


    }

    static int fact(int number) {

        if(number < 1){
            return 1;
        }

        return number * fact(number - 1);

    }

}
