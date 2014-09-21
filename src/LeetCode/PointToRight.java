package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/31/14
 */

public class PointToRight {
    private class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }

    public void connect(TreeLinkNode root) {
        TreeLinkNode leftWall = root;
        TreeLinkNode across = null;
        while(leftWall != null) {
            across = leftWall;
            while(across != null) {
                if(across.left != null ) {
                    across.left.next = across.right;
                }
                if(across.right != null && across.next != null) {
                    across.right.next = across.next.left;
                }
                across = across.next;
            }
            leftWall = leftWall.left;
        }
    }
}
