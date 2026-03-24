public class Main {

    public static int countContacts(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        return count;
    }
    public static void main(String[] args) {
        Node p1 = new Node("Josh", "123-456-789");
        Node p2 = new Node("Lily", "987-654-321");
        Node p3 = new Node("Bob", "112-233-445");
        Node p4 = new Node("Timmy", "554-433-221");
        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);

        Node current = p1;
        while (current != null) {
            System.out.println("Name: " + current.getName() + " Phone Number: " + current.getPhoneNumber());
            current = current.getNext();
        }
        System.out.println();

        System.out.println("Number of contacts: " + countContacts(current));


    }
}
