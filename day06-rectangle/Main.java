public static void main(String[] args) {

    Rectangle r1 = new Rectangle(4, 5);     
    Rectangle r2 = new Rectangle(2, 10);    
    Rectangle r3 = new Rectangle(6, 4);    

    Rectangle r4 = new Rectangle(r1);

    System.out.println("Rectangle r1:");
    r1.printDimensions();

    System.out.println("\nRectangle r2:");
    r2.printDimensions();

    System.out.println("\nRectangle r3:");
    r3.printDimensions();

    System.out.println("\nRectangle r4 (copy of r1):");
    r4.printDimensions();

    System.out.println("\nr1 equals r2? " + r1.equals(r2)); 
    System.out.println("r1 equals r3? " + r1.equals(r3));   

    System.out.println("\nr3 larger than r1? " + r3.larger(r1)); 
    System.out.println("r1 larger than r2? " + r1.larger(r2));   
}
