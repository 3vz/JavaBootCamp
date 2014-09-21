package LeetCode;

import LeetCode.BasicDataStructure.TreeNode;

import java.util.*;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 *
 * Given a binary tree, return the preorder traversal of its TreeNodes' values.
 */

public class TreeTraversal {


    public static void preorder(TreeNode n)
    {
        if (n != null)
        {
            System.out.print(n.data + " ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

    public static void inorder(TreeNode n)
    {
        if (n != null)
        {
            inorder(n.getLeft());
            System.out.print(n.data+ " ");
            inorder(n.getRight());
        }
    }

    public static void postorder(TreeNode n)
    {
        if (n != null)
        {
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.data+ " ");
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if (root==null) return result;
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.push(root);
        while (!s.empty()){
            TreeNode n=s.pop();
            if (n.right==null && n.left==null) result.add((Integer) n.data);
            else {
                s.push(new TreeNode(n.data)); //a special node with no child
                if (n.right!=null) s.push(n.right);
                if (n.left!=null) s.push(n.left);
            }
        }
        return result;
    }

    public static void levelorder(TreeNode n)
    {
        Queue<TreeNode> TreeNodequeue = new LinkedList<TreeNode>();
        if (n != null)
            TreeNodequeue.add(n);
        while (!TreeNodequeue.isEmpty())
        {
            TreeNode next = TreeNodequeue.remove();
            System.out.print(next.data + " ");
            if (next.getLeft() != null)
            {
                TreeNodequeue.add(next.getLeft());
            }
            if (next.getRight() != null)
            {
                TreeNodequeue.add(next.getRight());
            }
        }
    }

    public static void main(final String[] args)
    {
        TreeNode<Integer> one = new TreeNode<Integer>(1);
        TreeNode<Integer> two = new TreeNode<Integer>(2);
        TreeNode<Integer> three = new TreeNode<Integer>(3);
        TreeNode<Integer> four = new TreeNode<Integer>(4);
        TreeNode<Integer> five = new TreeNode<Integer>(5);
        TreeNode<Integer> six = new TreeNode<Integer>(6);
        TreeNode<Integer> seven = new TreeNode<Integer>(7);
        TreeNode<Integer> eight = new TreeNode<Integer>(8);
        TreeNode<Integer> nine = new TreeNode<Integer>(9);
        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        four.setLeft(seven);
        six.setLeft(eight);
        six.setRight(nine);
        preorder(one);
        System.out.println();
        inorder(one);
        System.out.println();
        postorder(one);
        System.out.println();
        levelorder(one);
        System.out.println();
    }

}
