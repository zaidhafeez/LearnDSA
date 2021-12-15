package lecture.Arrays;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        swap(arr, 0, 2);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int num : arr) {
//
//            System.out.print(num + " ");
//
//        }

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
