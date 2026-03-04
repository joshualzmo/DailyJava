public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super();
            if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative.");
            this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public int getRadius() {
        return radius;
    }
    public String toString() {
        return "Shape: Circle. Radius: " + radius;
    }

}
