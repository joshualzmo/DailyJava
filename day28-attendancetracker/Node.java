public class Node {
    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
        this.next = null;
    }
    
    public String getName() {
        return name;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }
}