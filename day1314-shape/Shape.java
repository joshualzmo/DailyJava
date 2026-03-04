public abstract class Shape {
    public abstract double getArea();
    public static Shape largerArea(Shape shape1, Shape shape2) {
        if (shape1.getArea() > shape2.getArea()) return shape1;
        return shape2;
    }
}