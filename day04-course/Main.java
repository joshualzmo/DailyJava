public static void main(String[] args) {
    Course c1 = new Course("Dr. Smith");
    Course c2 = new Course("Dr. Smith");
    Course c3 = new Course("Dr. Lee");

    System.out.println(c1.printInfo());
    System.out.println(c2.printInfo());
    System.out.println(c3.printInfo());

    Course.updateCourseCode("CS102");

    System.out.println("\nAfter updating course code:");
    System.out.println(c1.printInfo());
    System.out.println(c2.printInfo());
    System.out.println(c3.printInfo());

    System.out.println("\nInstructor comparisons:");
    System.out.println(c1.equals(c2)); 
    System.out.println(c1.equals(c3)); 
}
