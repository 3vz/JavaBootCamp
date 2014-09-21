package LeetCode;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class RemoveDupFromSort {
    public  int remove(int[] A) {
        int i = 0, j = 0, n = A.length;
        if (n == 0) return 0;
        while(j < n) {
            if (A[i] == A[j]) j++;
            else A[++i] = A[j++];
        }
        return i + 1;
    }
}
