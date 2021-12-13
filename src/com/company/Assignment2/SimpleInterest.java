package com.company.Assignment2;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float principal = in.nextFloat();
        float rate = in.nextFloat();
        int time = in.nextInt();

        float simpleInterest = (principal * rate * time)/100;

        System.out.println("The simple Interest is " + simpleInterest);

    }

}
