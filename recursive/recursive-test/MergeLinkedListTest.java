package recursive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeLinkedListTest {

    private LinkedListNode head;
    private LinkedListNode head2;

    @BeforeEach
    public void setUp() {
        head = new LinkedListNode(1);
        head2 = new LinkedListNode(4);
    }

    @Test
    public void testSearchValue() {
        head.next = new LinkedListNode(10);
        head2.next = new LinkedListNode(4);
        LinkedListNode result = head.mergeList(head, head2);
        assertEquals(result.val, 1);
        assertEquals(result.next.val, 4);
        assertEquals(result.next.next.val, 4);
        
    }
    
}
