public class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        if (numPages < 0) {
            throw new IllegalArgumentException("Must be a positive number.");
        }
        else {
        this.numPages = numPages;
        }
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getNumPages() {
        return this.numPages;
    }
}