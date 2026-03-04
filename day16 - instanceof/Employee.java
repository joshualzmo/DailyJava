public class Employee extends Person {
    private String deparment;

    public Employee(String name, int age, String department)  {
        super(name, age);
        this.deparment = department;
    }

    public String getDeparment() {
        return deparment;
    }
    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge() + " Deparment: " + deparment;
    }
}
