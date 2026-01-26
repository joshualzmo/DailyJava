public class Library {
    private final int SHELF_SIZE = 5;
    private Book[] libBooks = new Book[SHELF_SIZE];
    private int counter = 0;

    public Library() {
    } 
    public void addBook(Book b) {
        if (b == null) System.out.println("The object is empty.");
        else {
            if (counter < SHELF_SIZE) {
                for(int i = 0; i < libBooks.length; i++) {
                    if (libBooks[i] == null) {
                        libBooks[i] = b;
                        counter++;
                        break;
                    }
                }
            }
            else {
                System.out.println("Shelf is full.");
            }
        }
    }
    public void removeBook(int index) {
        if (index < 0 || index > libBooks.length - 1){
            System.out.println("Index out of range."); 
            return;
        } 
        if (libBooks[index] == null) {
            System.out.println("There is no book at this index.");
            return;
        }       
        libBooks[index] = null;
        counter--;
    }
    public boolean checkBook(String bookName) {
    for (int i = 0; i < libBooks.length; i++) {
        if (libBooks[i] != null && libBooks[i].getTitle().equals(bookName)) {
            return true;
        }
    }
    return false;
    }
    public void printBook() {
        for(int i = 0; i < libBooks.length; i++) {
            if (libBooks[i] == null) continue;
            else {
                System.out.println("Book " + (i+1));
                System.out.println("Title: " + libBooks[i].getTitle());
                System.out.println("Author: " + libBooks[i].getAuthor());
                System.out.println("# of Pages: " + libBooks[i].getNumPages());
                System.out.println();
            }
        }
    }
}
