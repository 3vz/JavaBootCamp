package LeetCode;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity : O(m*n)
 * Space Complexity:
 */

public class UniquePath {
    public int findPath(int m , int n) {
        int[][] pm = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j== 0) pm[i][j] = 1;
                else pm[i][j] = pm[i-1][j] +pm[i][j-1];
            }
        }
        return pm[m-1][n-1];
    }
}
