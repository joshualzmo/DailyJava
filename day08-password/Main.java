public class Main {

    public static void main(String[] args) {

        try {
            Password p1 = new Password("Secure123");
            System.out.println("Password 1 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password 1 error: " + e.getMessage());
        }

        try {
            Password p2 = new Password("Abc12");
            System.out.println("Password 2 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password 2 error: " + e.getMessage());
        }

        try {
            Password p3 = new Password("password1");
            System.out.println("Password 3 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password 3 error: " + e.getMessage());
        }

        try {
            Password p4 = new Password("Password");
            System.out.println("Password 4 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password 4 error: " + e.getMessage());
        }

        try {
            Password p5 = new Password("HelloWorld1");
            System.out.println("Matches 'HelloWorld1': " + p5.equalsPassword("HelloWorld1"));
            System.out.println("Matches 'WrongPass1': " + p5.equalsPassword("WrongPass1"));
        } catch (IllegalArgumentException e) {
            System.out.println("Password 5 error: " + e.getMessage());
        }
    }
}
