package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 *
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 */

public class NumberOfBST {
    public int numTrees(int n) {
        //Catalan Number = (2n)!/(n+1)!*n!
        int product = 1;
        if (n == 1)
            return 1;
        else {
            n=n-1;
            product = numTrees(n) * 2* (2*n+1)/(n+2);
        }
        return product;
    }
}
