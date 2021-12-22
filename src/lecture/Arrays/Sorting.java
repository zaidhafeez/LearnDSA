package lecture.Arrays;

import java.util.Arrays;

public class Sorting {



    public static void main(String[] args) {

        int[] num = {1,2,3,5,4};
//        System.out.println(Arrays.toString(new int[][]{{1},{23},{4}}));

        int[] sortedArray = bubbleSort(num);

        System.out.println(Arrays.toString(num));


    }

    static int[] bubbleSort(int[] num) {

        boolean swapped;

        for (int i = 0; i < num.length; i++) {
            swapped = false;
            for (int j = 1; j < num.length - i; j++) {

                if(num[j] < num[j - 1]){

                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                    swapped = true;
                }

            }
            if(!swapped) break;

        }

        return num;

    }


}
