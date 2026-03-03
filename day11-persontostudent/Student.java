public class Student extends Person {
    private int studentID;
    private double average;

    Student(String name, int age, int studentID, double average) throws IllegalArgumentException {
        super(name, age);
        String idCheck = String.valueOf(studentID);
        if (idCheck.length() != 5) throw new IllegalArgumentException("ID must be 5 digits long.");
        this.studentID = studentID;

        if (average < 0 || average > 100) throw new IllegalArgumentException("Average must be between 0 and 100.");
        this.average = average;
    }
    public int getID() {
        return studentID;
    }
    public double getAverage() {
        return average;
    }
    public String getDescription() {
        return "Student: " + getName() + " Age: " + getAge() + " ID: " + studentID + " Average: " + average;
    }
}

