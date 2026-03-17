import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scnr.nextLine();

        System.out.print("Enter student ID: ");
        int studentId = scnr.nextInt();

        System.out.print("How many grades do you want to enter? ");
        int numGrades = scnr.nextInt();

        Double[] grades = new Double[numGrades];

        for (int i = 0; i < numGrades; i++) {
            while (true) {
                try {
                    System.out.print("Enter grade " + (i + 1) + ": ");
                    grades[i] = scnr.nextDouble();
                    break; 
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scnr.next(); 
                }
            }
        }

        Student s = new Student(name, studentId, grades);
        System.out.println(s);
        s.printGrades();
        s.averageGrade();

        scnr.close();
    }
}