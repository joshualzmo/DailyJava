public class Student extends Person {
    private int id;
    private double average;

    public Student(String name, int age, int id, double average) {
        super(name, age);
        this.id = id;
        this.average = average;
    }
    public int getId() {
        return id;
    }
    public double getAverage() {
        return average;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge() + " ID: " + getId() + " Average: " + getAverage();
    }
}
