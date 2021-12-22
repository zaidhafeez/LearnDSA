package com.company.Assignment5;

import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int res = diagonalSum(mat);

        System.out.println(res);
    }

    static int diagonalSum(int[][] mat) {

        int ans = 0;

        for (int i = 0; i < mat.length; i++){

            ans += mat[i][i]; //primary diagonal matrix
            ans += mat[mat.length - 1 - i][i]; //secondary Diagonal Matrix (row + column) = n - 1 where n is the
            // lenghth of matrix

        }

        return mat.length % 2 == 0 ? ans : ans - mat[mat.length / 2][mat.length / 2];


    }

}
