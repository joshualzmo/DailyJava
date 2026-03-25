public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }
    public Node getHead() {
        return head;
    }

    public void addToFront(String item) {
        Node newNode = new Node(item);
        newNode.setNext(head);
        head = newNode;
    }

    public void addToEnd(String item) {
        Node newNode = new Node(item);
        Node current = head;
        if (head == null) head = newNode;
        else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
}