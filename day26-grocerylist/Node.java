public class Node {
    private String item;
    private Node next;

    public Node(String item) {
        this.item = item;
        this.next = null;
    }
    public String getItem() {
        return item;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }
    public Node getNext() {
        return next;
    }
}