public class Main {
    public static void main(String[] args) {

        School school = new School();

        Scholar s1 = new Scholar("Alice", 1234567, 85.5);
        Scholar s2 = new Scholar("Bob", 2345678, 78.0);
        Scholar s3 = new Scholar("Charlie", 3456789, 92.3);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        System.out.println("Class average: " + school.average(school.getLectureHall()));
        System.out.println("Highest average: " + school.highestAverage(school.getLectureHall()));
    }
}
