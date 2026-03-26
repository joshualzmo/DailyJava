import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       LinkedList attendance = new LinkedList();
       String input;
       boolean running = true;

       while (running) {
            System.out.println("Enter a student's name to add to the attendance list or 'done' to exit: ");
            input = scnr.nextLine();
            if (input.equalsIgnoreCase("done")){
                running = false;
                break;
            } 
            attendance.addStudent(input);
        }

        running = true;
        while (running) {
            System.out.println("Enter a student's name to search for or 'done' to exit: ");
            input = scnr.nextLine();
            if (input.equalsIgnoreCase("done")) {
                running = false;
            }
            else {
                if (attendance.findStudent(input) == true) {
                    System.out.println("Student is present"); 
                }
                else {
                    System.out.println("Student is not present");      
                }
            }   
        }
        System.out.println();
        System.out.println("Total number of students present: " + attendance.countStudents());

        scnr.close();
    }
}