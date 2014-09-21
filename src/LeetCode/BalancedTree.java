package LeetCode;

import LeetCode.BasicDataStructure.TreeNode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/11/14
 */

public class BalancedTree {
    public boolean checkBalanced(TreeNode root) {
        return root == null || getHeight(root) != -1;
        //if (root == null) return true;
        //if (getHeight(root) == -1)
        //    return false;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight  = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
