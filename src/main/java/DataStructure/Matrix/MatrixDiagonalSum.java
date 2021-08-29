package DataStructure.Matrix;

/**
 * Matrix: Easy
 * 1572. Matrix Diagonal Sum
 */

public class MatrixDiagonalSum {

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int diagonalSum = 0;

        //Row Number is same for Principal Diagonal (row,row)
        //Secondary Diagonal (row, dimension of matrix - 1 - row)
        for (int i = 0; i < size; i++) {
            diagonalSum += mat[i][i] + mat[i][size - 1 - i];
        }

        //Removing Duplicate Occurrence of Center, In case of Odd Dimensional Matrix
        if (size % 2 != 0) {
            diagonalSum -= mat[size / 2][size / 2];
        }
        return diagonalSum;
    }
}
