package LeetCode;

import LeetCode.BasicDataStructure.TreeNode;

import java.util.Stack;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class SymmetricTree {

    // recurisive way
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.data!= right.data) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    // store the treeNode via stack
    public boolean isSymmetricStack(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> leftStack = new Stack<TreeNode>();
        Stack<TreeNode> rightStack= new Stack<TreeNode>();
        leftStack.push(root.left);
        rightStack.push(root.right);
        while(!leftStack.empty() && !rightStack.empty()) {
            TreeNode nl = leftStack.pop();
            TreeNode nr = rightStack.pop();

            if (nl == null && nr == null) continue;
            if (nl == null || nr == null) return false;
            if (nl.data !=  nr.data) return false;
            // the order of pushing TreeNodes into the stack is really important!!!
            leftStack.push(nl.left);
            rightStack.push(nr.right);
            leftStack.push(nl.right);
            rightStack.push(nr.left);
        }
        return true;
    }
}
