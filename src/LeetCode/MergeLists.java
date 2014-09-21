package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   8/31/14
 */

public class MergeLists {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
        val = x;
        next = null;}
    }

    public ListNode merge(ListNode listOne, ListNode listTwo) {
        if (listOne == null) return listTwo;
        if (listTwo == null) return listOne;

        if (listOne.val < listTwo.val) {
            listOne.next = merge(listOne.next, listTwo);
            return listOne;
        }
        else {
            listTwo.next = merge(listTwo.next, listOne);
            return listTwo;
        }

    }

    public static void main(String[] args) {

    }
}
