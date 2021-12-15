package lecture.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end){

            swap(arr,start,end);
            start++;
            end--;

        }

    }

    static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}
