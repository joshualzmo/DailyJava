public class Main {
    public static void main(String[] args) {
        int NUM_ELEMENTS = 4;
        Person[] arr = new Person[NUM_ELEMENTS];
        int count = 0;

        // Create student and employee objects
        Person e1 = new Employee("Joe", 25, "Manager");
        arr[count] = e1;
        count++;

        Person s1 = new Student("Ronald", 18, 12345, 90.0);
        arr[count] = s1;
        count++;
        
        Person e2 = new Employee("Bob", 40, "Custodian");
        arr[count] = e2;
        count++;

        Person s2 = new Student("Carl", 22, 67890, 67.0);
        arr[count] = s2;
        count++; 

        // Check for employees
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Is " + arr[i].getName() + " an Employee");
            System.out.println(arr[i] instanceof Employee);
        }
        // Check for students
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Is " + arr[i].getName() + " an Employee");
            System.out.println(arr[i] instanceof Student);
        } 


    }
}
