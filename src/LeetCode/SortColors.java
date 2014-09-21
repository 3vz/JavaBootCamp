package LeetCode;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :O(N)
 * Space Complexity:
 */

public class SortColors {
    public int[] sortColors(int[] colors) {
        int  b = -1, w = -1, r = -1;
        for (int i = 0; i < colors.length; i++ ) {
            if (colors[i] == 0) {
                colors[++b] = 2;
                colors[++w] = 1;
                colors[++r] = 0;
            }
            else if (colors[i] == 1) {
                colors[++b] = 2;
                colors[++w] = 1;
            }
            else {
                colors[++b] = 2;
            }
        }
        return colors;
    }
}
