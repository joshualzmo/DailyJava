public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Point2D)) return false;

        Point2D other = (Point2D) obj;
        return this.x == other.x && this.y == other.y;
    }

    public double fromOrigin() {
        double distance = Math.sqrt((x*x) + (y*y));
        return distance;
    }


}