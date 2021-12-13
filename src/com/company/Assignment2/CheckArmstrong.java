    package com.company.Assignment2;

    public class CheckArmstrong {

        public static void main(String[] args) {

            for(int i = 100; i <= 1000; i++){

                int n = i;
                int number = 0;

                while(n != 0){


                    int rem = n % 10;
                    int cubeRem = rem * rem * rem;
                    number += cubeRem;
                    n = n / 10;
                }

                if(i == number){
                    System.out.print(" " + i);
                }

            }

        }

    }
