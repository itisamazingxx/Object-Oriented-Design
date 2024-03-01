/**
 * Double Linked List node
 */
public class Node {
    char value;
    Node prev, next;

    public Node() {}

    public Node(char value) {
        this.value = value;
    }

    /**
     * Inserts node after "this"
     */
    public Node insert(Node node) {
        node.prev = this;
        node.next = this.next;
        this.next = node;
        node.next.prev = node;
        return node;
    }

    public void remove() {
        this.prev.next = this.next;
        this.next.prev = this.prev;
    }
}
