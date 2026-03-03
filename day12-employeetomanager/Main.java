public class Main {
    public static void main(String[] args) {

        // Test Employee
        try {
            Employee e1 = new Employee("Alice", 55000);
            System.out.println(e1);

            // This will throw an exception (negative salary)
            Employee e2 = new Employee("Bob", -20000);
            System.out.println(e2);

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Employee: " + e.getMessage());
        }

        System.out.println();

        // Test Manager
        try {
            Manager m1 = new Manager("Charlie", 85000, "Finance");
            System.out.println(m1);

            // This will throw an exception (blank department)
            Manager m2 = new Manager("Dana", 90000, "");
            System.out.println(m2);

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Manager: " + e.getMessage());
        }
    }
}