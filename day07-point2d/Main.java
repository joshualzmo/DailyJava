public class Main {
    public static void main(String[] args) {

        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(3, 4);
        Point2D p3 = new Point2D(1, 2);

        // Test equals
        System.out.println("p1 equals p2: " + p1.equals(p2)); 
        System.out.println("p1 equals p3: " + p1.equals(p3)); 
        System.out.println("p1 equals null: " + p1.equals(null)); 

        // Test distance from origin
        System.out.println("Distance of p1 from origin: " + p1.fromOrigin());
        System.out.println("Distance of p3 from origin: " + p3.fromOrigin());
    }
}
