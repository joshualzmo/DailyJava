public class Node {
    private String title, artist;
    private Node next;

    public Node(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }
    
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }
}