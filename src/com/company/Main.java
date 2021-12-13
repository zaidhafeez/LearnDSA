package com.company;


import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 20;
        String name = "Zaid";
        swap(a, b);



    }

    static void swap(int a, int b) {

        int num1 = a;
        int num2 = b;

        num1  = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The new number is : " + num1 + " "+ num2);


    }
}
