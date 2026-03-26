public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }
    public void addStudent(String student) {
        if (head == null) {
            Node newNode = new Node(student);
            head = newNode;
        }
        else {
            Node newNode = new Node(student);
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);

        }
    }

    public boolean findStudent(String name) {
        Node current = head;
        while (current != null) {
            if (current.getName().equalsIgnoreCase(name)) return true;
            else current = current.getNext();
        }
        return false;
    }

    public int countStudents() {
        int count = 0;
        Node current = head;
        if (current == null) return 0;
        while (current != null) { 
            count++;
            current = current.getNext();      
        }
        return count;

    }

}
