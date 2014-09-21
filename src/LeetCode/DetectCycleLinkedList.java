package LeetCode;

import LeetCode.BasicDataStructure.ListNode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/11/14
 */

public class DetectCycleLinkedList {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        // while both of them entered the cycle,
        // the hare is definetly to overlap the tortoise at some node,
        // we define it as m:
        // The hare totally runs: x + ky + m
        // The tortoise totally runs: x + ty + m
        // Thus, ky = 2ty + x + m we have (x + m) mod y = 0
        // We can conclude that if the hare run more x steps
        // it will reach the cycle's starting node.
        ListNode slow = head;
        ListNode fast = head;
        do{
            if(slow == null || fast == null) return null;
            slow = slow.next;
            fast = fast.next;
            if( fast!= null ) fast = fast.next;
            else return null;
        }
        while( slow != fast );
        slow = head;
        while( slow != fast ){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
