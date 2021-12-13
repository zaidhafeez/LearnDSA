package com.company.Assignment2;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        char op = in.next().trim().charAt(0);
        if(op == '+'){

            ans = num1 + num2;

        }
        if(op == '-'){

            ans = num1 - num2;

        }
        if(op == '*'){

            ans = num1 * num2;

        }
        if(op == '/'){

            ans = num1 / num2;

        }

        System.out.println(ans);

    }

}
