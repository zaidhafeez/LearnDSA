package com.company.Assignment4;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final float PI = 3.14f;

        int radius = in.nextInt();

        System.out.println("The area of circle is: " + getArea(PI, radius) + " and circumference is: " + getCircumference(PI, radius));


    }

    static float getCircumference(float pi, int radius) {

        return 2 * pi * radius;

    }

    static float getArea(float pi, int radius) {

        return pi * radius * radius;

    }

}
