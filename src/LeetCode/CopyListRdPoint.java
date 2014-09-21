package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/12/14
 */

public class CopyListRdPoint {
    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    };

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode p = head;
        do {
            RandomListNode q = p.next;
            p.next = new RandomListNode(p.label);
            p.next.next = q;
            p = q;
        } while (p != null);
        p = head;
        do {
            p.next.random = (p.random == null) ? null : p.random.next;
            p = p.next.next;
        } while (p != null);
        p = head;
        RandomListNode r = head.next;
        for (RandomListNode q = r; ; ) {
            p.next = q.next;
            p = p.next;
            if (p == null) break;
            q.next = p.next;
            q = q.next;
        }
        return r;
    }
}
