import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        Scanner scnr = new Scanner(System.in);
        boolean running = true;

        for (int i = 0; i < movies.length; i++) {
            boolean validMovie = false;

            while (!validMovie) {
                try {
                    System.out.println("Enter a movie title: ");
                    String input = scnr.nextLine();

                    System.out.println("Enter a rating: ");
                    int rating = scnr.nextInt();
                    scnr.nextLine(); 

                    movies[i] = new Movie(input, rating);
                    validMovie = true;
                    }
                catch (IllegalArgumentException e) {
                    System.out.println("Invalid input. Try again.");
                    scnr.nextLine(); 
                }
            }
        }

        while (running) {
            System.out.println("\nMENU");
            System.out.println("1. View all movies");
            System.out.println("2. View highest rated");
            System.out.println("3. View average rating");
            System.out.println("4. Exit");

            try {
                int choice = scnr.nextInt();
                scnr.nextLine(); 

                switch (choice) {
                    case 1:
                        for (int i = 0; i < movies.length; i++) {
                            System.out.println(movies[i]);
                        }
                        break;

                    case 2:
                        int maxIndex = 0;
                        for (int i = 1; i < movies.length; i++) {
                            if (movies[i].getRating() > movies[maxIndex].getRating()) {
                                maxIndex = i;
                            }
                        }
                        System.out.println("Highest rated movie: " + movies[maxIndex]);
                        break;

                    case 3:
                        int bin = 0;
                        for (int i = 0; i < movies.length; i++) {
                            bin += movies[i].getRating();
                        }
                        System.out.println("Average movie rating: " + ((double) bin / movies.length));
                        break;

                    case 4:
                        running = false;
                        System.out.println("Goodbye.");
                        break;

                    default:
                        System.out.println("Invalid menu choice.");
                }
            } catch (Exception e) {
                System.out.println("Input Error.");
                scnr.nextLine(); 
            }
        }

        scnr.close();
    }
}

