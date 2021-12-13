package com.company.Assignment3;

import java.util.Scanner;

public class ArOfCircle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final float PI = 3.14f;

        float radius = in.nextFloat();

        float area  = (PI * radius * radius);

        System.out.println("The area of circle is : "+ area);


    }

}
