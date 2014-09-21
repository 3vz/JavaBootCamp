package LeetCode;

import java.util.Arrays;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity : O(NlongN)
 * Space Complexity:
 */

public class MergeSotedArray {
    public int[] merge(int[] A, int m, int[] B, int n) {
        if (A == null) return B;
        if (B == null) return A;
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0) {
            if (A[i] > B[j]) A[k--] = A[i--];
            else A[k--] = B[j--];
        }
        //when i || j ==0, go through while , when j == 0, no need to do it, because it processed depending on A,
        // the head elements of A are still there and sorted, but if i == 0 , we need add B's left elements into A's beginning.
        while(j >= 0) A[k--] = B[j--];
        return A;
    }

    public static void main(String[] args) {
        MergeSotedArray test = new MergeSotedArray();
        int[] a = {1,3,5,6,7,9};
        int[] b= {2,3,10,12,19};
        System.out.println(Arrays.toString(test.merge(a, 11, b, 5)));
    }
}
