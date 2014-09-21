package LeetCode;

/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        for (int i = 0; i < matrix.length/2; i ++) {
            for (int j = i; j < n - i - 1; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n -j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}
