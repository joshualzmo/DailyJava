public class TestStudent {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("Kayden", 19, 12345, 87.5);
            System.out.println(s1.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create s1: " + e.getMessage());
        }

        try {
            Student s2 = new Student("Alex", -2, 54321, 91.2);
            System.out.println(s2.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create s2: " + e.getMessage());
        }

        try {
            Student s3 = new Student("Jordan", 20, 123, 75.0);
            System.out.println(s3.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create s3: " + e.getMessage());
        }
    }
}