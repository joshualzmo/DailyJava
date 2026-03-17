import java.util.Scanner;

public class LibraryUser {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Book[] libraryBooks = new Book[5];
        Book[] userBooks = new Book[5];
        boolean running = true;
        int count = 0;

        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryBooks[0] = b1;
        Book b2 = new Book("1984", "George Orwell");
        libraryBooks[1] = b2;
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        libraryBooks[2] = b3;
        Book b4 = new Book("Pride and Prejudice", "Jane Austen");
        libraryBooks[3] = b4;
        Book b5 = new Book("The Hobbit", "J.R.R Tolkien");
        libraryBooks[4] = b5;

        while (running) {
            String choice;
            String bookName;
            boolean found = false;

            System.out.println("Enter the book you would like to check out:");
            bookName = scnr.nextLine();

            try {
                for (int i = 0; i < libraryBooks.length; i++) {
                    if (bookName.equalsIgnoreCase(libraryBooks[i].getTitle())) {
                        found = true;

                        if (!libraryBooks[i].getAvailability()) {
                            throw new BookUnavailableException("Book is unavailable");
                        }

                        if (count < userBooks.length) {
                            userBooks[count] = libraryBooks[i];
                            count++;
                            libraryBooks[i].setAavailability();
                            System.out.println("Book checked out successfully.");
                        } else {
                            System.out.println("You cannot check out any more books.");
                        }

                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book not found in library.");
                }

            } catch (BookUnavailableException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Would you like to check another book out? (y/n)");
            choice = scnr.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                running = false;
            }
        }

        scnr.close();
    }
}