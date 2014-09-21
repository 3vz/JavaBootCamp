package LeetCode;

import java.util.Arrays;

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if (row == 0 || col == 0) return 0;
        int[] ans= new int[col];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[0] = 0;
        for (int i = 0; i < row; i++) {
            ans[0] = ans[0] + grid[i][0];
            for (int j = 1; j < col; j++) {
                ans[j] = grid[i][j] + Math.min(ans[j], ans[j-1]);
            }
        }
        return ans[col-1];
    }
}
