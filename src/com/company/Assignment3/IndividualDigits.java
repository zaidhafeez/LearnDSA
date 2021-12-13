    package com.company.Assignment3;

    import java.util.Scanner;

    public class IndividualDigits {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int number = in.nextInt();
            int diff = 0;
            int sum = 0;
            int product = 1;

            while (number != 0){



                int digits = number % 10;

                sum += digits;
                product *= digits;

                number /= 10;



            }
    //        System.out.println(sum);
    //        System.out.println(product);
            diff = product - sum;
            System.out.println(diff);


        }


    }
