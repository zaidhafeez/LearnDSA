package com.company.Assignment5;

import java.util.Arrays;

public class Q17_TransposeMatrix {

    public static void main(String[] args) {

        int[][] matrix= {{1,2,3},{4,5,6}}; //{{1,2,3},{4,5,6},{7,8,9}};

        int[][] res = transpose(matrix);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }


        }

    static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;

        int transposeRow = column;
        int transPoseColumn = row;

        int[][] transposeMatrix = new int[column][row];
        for (int j = 0; j < transposeRow; j++) {

            for (int i = 0; i < transPoseColumn; i++) {

                transposeMatrix[j][i] = matrix[i][j];

            }


        }

        return transposeMatrix;

    }

}

