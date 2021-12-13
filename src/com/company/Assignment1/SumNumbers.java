package com.company.Assignment1;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total = 0;


        while (true) {

            String usrInput = in.next();

            if(usrInput.equals("x")){
                break;
            }
            else{
                int num = Integer.parseInt(usrInput);
                total += num;
            }

        }

        System.out.println("The sum is : " + total);

    }

}
