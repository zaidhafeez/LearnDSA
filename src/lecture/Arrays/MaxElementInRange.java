package lecture.Arrays;

import java.util.Scanner;

public class MaxElementInRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        int rangeStart = 1;
        int rangeEnd = 3;

//        int[] a = new int[]{1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }

        int ans = findMax(arr,rangeStart,rangeEnd);

        System.out.println("The Maximum Element in the range: " + ans);

    }

    static int findMax(int[] arr, int rangeStart, int rangeEnd) {

        if(arr == null)  return Integer.MIN_VALUE;

        if (arr.length == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        while(rangeStart <= rangeEnd){

            if(arr[rangeStart] > max) max = arr[rangeStart];
            rangeStart++;

        }
        return max;
    }

}
