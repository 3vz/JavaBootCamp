package LeetCode;

import LeetCode.BasicDataStructure.TreeNode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 *
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal
 * if they are structurally identical and the nodes have the same value.
 */

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        else
            return(p.data == q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
