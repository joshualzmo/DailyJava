public class Main {
    public static void main(String[] args) {
        int ARR_SIZE = 4; 
        Shape[] shapeArr = new Shape[ARR_SIZE];
        int count = 0;
            // Circle objects
            Shape c1 = new Circle(5);  
            shapeArr[count] = c1;
            count++;
        
            Shape c2 = new Circle(8);
            shapeArr[count] = c2;
            count++;

            // Rectangle objects
            Shape r1 = new Rectangle(4, 3);
            shapeArr[count] = r1;
            count++;

            Shape r2 = new Rectangle(7, 2);
            shapeArr[count] = r2;
            count++;

        // Comparing area
        System.out.println(Shape.largerArea(c1, c2));
        System.out.println(Shape.largerArea(r1, r2));
        
        // Printing shapes
        for(int i = 0; i < shapeArr.length; i++) {
            System.out.println(shapeArr[i]);
        }
    }
}
