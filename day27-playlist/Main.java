import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList playlist = new LinkedList();
        Scanner scnr = new Scanner(System.in);
        boolean running = true;
        String input, title, artist;

        while (running) {
            System.out.println("Enter a song title: ");
            title = scnr.nextLine();
            System.out.println("Enter the artist: ");
            artist = scnr.nextLine();
            playlist.addSong(title, artist);

            System.out.println("Would you like to add another song? (y/n): "); 
            input = scnr.nextLine();
            if (!input.equalsIgnoreCase("y")) running = false;
        }

        Node current = playlist.getHead();
        while (current != null) {
            System.out.println(current.getTitle() + " by " + current.getArtist());
            current = current.getNext();
        }

        System.out.println("Size of the playlist: " + playlist.size() + " songs.");

        scnr.close();
    }
}
