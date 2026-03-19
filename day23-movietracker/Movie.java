class Movie {
    private String name;
    private int rating;

    public Movie(String name, int rating) throws IllegalArgumentException {
        if (name.isBlank()) throw new IllegalArgumentException("Title cannot be empty.");
        this.name = name;
        if (rating < 0 || rating > 10) throw new IllegalArgumentException("Rating must be between 0-10.");
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }
    public void setName(String name) {
        if (name.isBlank()) throw new IllegalArgumentException("Title cannot be empty.");
        this.name = name;
    }
    public void setRating(int rating) {
        if (rating < 0 || rating > 10) throw new IllegalArgumentException("Rating must be between 1-10.");
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Title: " + name + " Rating: " + rating + "/10";
    }
}