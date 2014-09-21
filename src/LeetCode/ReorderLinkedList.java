package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/11/14
 */

public class ReorderLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;}
    }

    public ListNode reverse(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        ListNode nh = cur;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = nh;
            nh = temp;
        }
        return nh;
    }

    //get the middle node of the linked list.
    public ListNode getMiddle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slowPointer, fastPointer;
        slowPointer = fastPointer = head;
        while(fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode reorderList(ListNode head) {
        if (head == null) return null;
        ListNode middleHead = getMiddle(head);
        ListNode halfHead = middleHead.next;
        middleHead.next = null;
        ListNode reverHead = reverse(halfHead);
        ListNode curr = head;
        while(reverHead != null) {
            ListNode temp = reverHead.next;
            reverHead.next = curr.next;
            curr.next = reverHead;
            curr = curr.next.next;
            reverHead = temp;
        }
        return head;
    }
}
