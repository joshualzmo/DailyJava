public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book b3 = new Book("Dune", "Frank Herbert", 412);
        Book b4 = new Book("Fahrenheit 451", "Ray Bradbury", 194);
        Book b5 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book b6 = new Book("Extra Book", "Overflow Author", 100);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        library.addBook(b6);

        System.out.println("=== Library Contents ===");
        library.printBook();

        System.out.println("Has 1984? " + library.checkBook("1984"));
        System.out.println("Has Dune? " + library.checkBook("Dune"));
        System.out.println("Has Harry Potter? " + library.checkBook("Harry Potter"));

        System.out.println("\nRemoving book at index 2...");
        library.removeBook(2);

        System.out.println("\n=== After Removal ===");
        library.printBook();

        System.out.println("Adding a new book after removal...");
        library.addBook(b6);

        System.out.println("\n=== Final Library ===");
        library.printBook();
    }
}
