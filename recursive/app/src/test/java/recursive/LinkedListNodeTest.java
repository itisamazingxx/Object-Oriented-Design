package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListNodeTest {

    private LinkedListNode head;

    @BeforeEach
    public void setUp() {
        head = new LinkedListNode(1);
    }

    @Test
    public void testLinkedList() {
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);

        LinkedListNode afterReverse = head.reverseList(head);
        assertEquals(5, afterReverse.val);
        
    }
    
}
