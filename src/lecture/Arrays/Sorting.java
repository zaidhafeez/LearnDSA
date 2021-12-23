package lecture.Arrays;

import java.util.Arrays;

public class Sorting {



    public static void main(String[] args) {

        int[] num = {1,2,3,5,4};
//        System.out.println(Arrays.toString(new int[][]{{1},{23},{4}}));

        int[] sortedArray = bubbleSort(num);
//        int[] sortedArray = selectionSort(num);

        System.out.println(Arrays.toString(sortedArray));


    }

    static int[] selectionSort(int[] num) {

        for (int i = 0; i < num.length; i++) {

            int last = num.length - i - 1;
            int maxIndex = findMax(num, 0, last);
            swap(num,maxIndex,last);


        }

        return num;

    }

    static void swap(int[] num, int first, int second) {

        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;


    }

    private static int findMax(int[] num,int start,int last) {

        int maxIndex = start;

        for (int i = 1; i <= last; i++) {

            if(num[maxIndex] < num[i]){
                maxIndex = i;
            }

        }

        return maxIndex;

    }

    static int[] bubbleSort(int[] num){

        for (int i = 0; i < num.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < num.length - i; j++) {
                if(num[j] < num[j - 1]){
                    swap(num,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped) return num;
        }

        return num;
    }

//    static int[] bubbleSort(int[] num) {
//
//        boolean swapped;
//
//        for (int i = 0; i < num.length; i++) {
//            swapped = false;
//            for (int j = 1; j < num.length - i; j++) {
//
//                if(num[j] < num[j - 1]){
//
//                    int temp = num[j];
//                    num[j] = num[j - 1];
//                    num[j - 1] = temp;
//                    swapped = true;
//                }
//
//            }
//            if(!swapped) break;
//
//        }
//
//        return num;
//
//    }


}
