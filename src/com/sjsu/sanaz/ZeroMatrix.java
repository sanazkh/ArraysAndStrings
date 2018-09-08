package com.sjsu.sanaz;

/**
 * Created by sanazk on 8/6/18.
 */
public class ZeroMatrix {

    void setZeros(int[][] myMatrix) {
        boolean[] row = new boolean[myMatrix.length];
        boolean[] column = new boolean[myMatrix[0].length];

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                if (myMatrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }


        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullifyRow(myMatrix, i);
            }
        }

        for (int j = 0; j < column.length; j++) {
            if (column[j]) {
                nullifyColumn(myMatrix, j);
            }
        }


}

    void nullifyRow(int[][] matrix, int rowIndex) {
        for(int i = 0; i < matrix[0].length; i++){
            matrix[rowIndex][i] = 0;
        }
    }

    void nullifyColumn(int[][] matrix, int columnIndex) {
        for(int i = 0; i < matrix.length; i++){
            matrix[i][columnIndex] = 0;
        }
    }

}
