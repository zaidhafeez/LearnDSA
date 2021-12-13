package com.company.Assignment1;

import java.util.Scanner;

public class HCFLCM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int x = num1;
        int y = num2;

        while(num1 != num2){

            if(num1 > num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }

        int hcf = num1;

        System.out.println("The H.c.f is; " + hcf);

        // L.C.M

        int lcm = (x * y)/hcf;

        System.out.println("The Lcm is: " + lcm);

    }




}
