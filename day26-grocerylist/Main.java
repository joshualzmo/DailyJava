import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        LinkedList groceries = new LinkedList();
        String input = "";
        boolean running = true;

        while (running) {
            System.out.println("Add to the grocery list or 'stop' to exit: ");
            input = scnr.nextLine();

            if (!input.equalsIgnoreCase("stop")) groceries.addToFront(input);
            else running = false;

        }

        System.out.println("Would you like to add items to the end of your list? (y/n): ");
        input = scnr.nextLine();

        if (input.equalsIgnoreCase("y")) {
            running = true;
            while (running) {
                System.out.println("Add to the grocery list or 'stop' to exit: ");
                input = scnr.nextLine();

                if (!input.equalsIgnoreCase("stop")) groceries.addToEnd(input);
                else running = false;

            }
        }
        System.out.println();
        
        Node current = groceries.getHead();
        while (current != null) {
            System.out.println(current.getItem());
            current = current.getNext();
        }
        scnr.close();
    }
}
