public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(Rectangle original) {
        this.length = original.length;
        this.width = original.width;
    }
    public int area() {
        return length * width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    public boolean equals(Rectangle other) {
        return this.area() == other.area();
    }
    public boolean larger(Rectangle other) {
        return this.area() > other.area();
    }
    public void printDimensions() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.area());
    }

}
