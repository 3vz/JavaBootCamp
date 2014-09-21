package LeetCode;

import LeetCode.BasicDataStructure.TreeNode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 *
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes
 * along the longest path from the root node
 * down to the farthest leaf node.
 */

public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else
            return getDepth(root, 1);
    }

    public int getDepth(TreeNode node, int depth) {
        int leftDep = depth;
        int rightDep = depth;
        if(node.left != null) leftDep = getDepth(node.left, depth + 1);
        if(node.right != null) rightDep = getDepth(node.right, depth + 1);

        return leftDep > rightDep ? leftDep: rightDep;
    }
}
