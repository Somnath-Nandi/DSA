// Given two square matrices, a[][] and b[][], each of size n x n. The task is to compute the sum of these two matrices and store the result in the matrix a[][] itself.

// addition_of_matrices
// Examples:

// Input: a[][] = [[1, 2], [3, 4]], b[][] = [[4, 3], [2, 1]]
// Output: [[5, 5], [5, 5]]
// Explanation: The result will be: [[5, 5], [5, 5]] after adding the corresponding elements of both matrices.

// Input: a[][] = [[7, 8], [9, 10]], b[][] = [[1, 2], [3, 4]]
// Output: [[8, 10], [12, 14]]
// Explanation: The result will be [[8, 10], [12, 14]] after adding the corresponding elements of both matrices. 

public class Sum_of_Square_Matrices {
    public static void main(String[] args) {
        int[][] a = { { 7, 8 }, { 9, 10 } };
        int[][] b = { { 1, 2 }, { 3, 4 } };

        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
