public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }
    public Node getHead() {
        return head;
    }

    public void addSong(String title, String artist) {
        Node newNode = new Node(title, artist);
        newNode.setNext(head);
        head = newNode;
    }
    public int size() {
        if (head == null) return 0;
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        return count;
    }
}