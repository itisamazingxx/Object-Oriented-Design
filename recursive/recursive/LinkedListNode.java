package recursive;

/**
 * Reverses Linked List
 */
public class LinkedListNode {
    protected int val;
    protected LinkedListNode next;

    public LinkedListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public LinkedListNode reverseList(LinkedListNode head) {
        LinkedListNode pre = null;
        LinkedListNode cur = head;
        return reverse(cur, pre);
    }

    private LinkedListNode reverse(LinkedListNode cur, LinkedListNode pre) {
        if (cur == null) {
            return pre;
        }
        LinkedListNode next_node = cur.next;
        cur.next = pre;
        return reverse(next_node, cur);
    }

    /**
     * Merge two Linked List, returns head
     */
    public LinkedListNode mergeList(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeList(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeList(l1, l2.next);
            return l2;
        }
    }

    public LinkedListNode removeNode(LinkedListNode list, int val) {
        LinkedListNode cur = list;
        return remove(cur, val);
    }

    private LinkedListNode remove(LinkedListNode cur, int val) {
        if (cur == null) {
            return null;
        }
        cur.next = remove(cur.next, val);
        if (cur.val == val) {
            return cur.next;
        }
        return cur;
    }
}
