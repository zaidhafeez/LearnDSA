package com.company.Assignment4;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("The number is palindrome?" + isPalindrome(number));

    }

    static boolean isPalindrome(int number) {

        int newNum = 0;

        while(number > newNum){

            int digits = number % 10;

            newNum = newNum * 10 + digits;

            number /= 10;

        }

        return (number == newNum || (number == newNum / 10));
    }


}
