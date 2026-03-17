class Book {
    private String title;
    private String author;
    private boolean available = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getAvailability() {
        return available;
    }
    public void setAavailability() {
        if (available = true) available = false;
        if (available = false) available = true;
    }
}