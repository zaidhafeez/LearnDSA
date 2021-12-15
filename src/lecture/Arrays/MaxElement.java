package lecture.Arrays;

import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }

        int max = findMax(arr);
        System.out.println("The Maximum Element is: " + max);

    }

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }

        }

        return max;

    }

}
