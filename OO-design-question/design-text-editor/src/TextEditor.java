public class TextEditor {
    private Node root, cur;

    public TextEditor() {
        this.root = this.cur = new Node();
        this.root.prev = root;
        this.root.next = root;
    }

    public void addText(String text) {
        for (int i = 0; i < text.length(); i++) {
            this.cur = this.cur.insert(new Node(text.charAt(i)));
        }
    }

    public int deleteText(int k) {
        int deletedChar = 0;
        while (k > 0 && this.cur != this.root) {
            this.cur = cur.prev;
            this.cur.next.remove();
            k--;
            deletedChar++;
        }
        return deletedChar;
    }

    public String cursorLeft(int k) {
        while (k > 0 && this.cur != this.root) {
            this.cur = this.cur.prev;
            k--;
        }
        return collectLeftChar(10);
    }

    public String cursorRight(int k) {
        while (k > 0 && this.cur.next != this.root) {
            this.cur = this.cur.next;
            k--;
        }
        return collectLeftChar(10);
    }

    private String collectLeftChar(int n) {
        StringBuilder builder = new StringBuilder();
        Node temp = this.cur;
        while (n > 0 && temp != this.root) {
            builder.insert(0, temp.value);
            temp = temp.prev;
            n--;
        }
        return builder.toString();
    }
}
