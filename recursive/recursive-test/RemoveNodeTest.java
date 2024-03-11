package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveNodeTest {

    private LinkedListNode head;

    @BeforeEach
    public void setUp() {
        head = new LinkedListNode(1);
    }

    @Test
    public void testLinkedList() {
        head.next = new LinkedListNode(5);
        head.next.next = new LinkedListNode(5);
        head.next.next.next = new LinkedListNode(2);
        head.next.next.next.next = new LinkedListNode(10);

        LinkedListNode afterRemove = head.removeNode(head, 5);
        assertEquals(afterRemove.next.val, 2);
        
    }
    
}
