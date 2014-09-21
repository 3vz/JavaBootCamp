package DataStructure;

/**
 * Author: zhaozhen1002
 * Date: 5/21/14
 */
public class LinkedListNode {

    private LinkedListNode prev;
    private LinkedListNode next;
    private int data;

    public LinkedListNode (int input, LinkedListNode p, LinkedListNode n) {
        data = input;
        setPrev(p);
        setNext(n);

    }

    private void setPrev(LinkedListNode p) {
        prev = p;
        if ( p != null && p.next != this) {
            p.setNext(this);
        }
    }

    private void setNext(LinkedListNode n) {
        next = n;
        if ( n != null && n.prev != this) {
            n.setPrev(this);
        }
    }

}
