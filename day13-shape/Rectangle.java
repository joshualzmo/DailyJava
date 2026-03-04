public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length)  {
        super();
        if (width < 0 || length < 0) throw new IllegalArgumentException("Values cannot be negative.");
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
    public String toString() {
        return "Shape: Rectangle. Width: " + width + " Length: " + length;
    }
}
