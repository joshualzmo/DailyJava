public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) throws IllegalArgumentException {
        if (name.isBlank()) throw new IllegalArgumentException("Enter a valid name.");
        this.name = name; 
        if (salary < 0) throw new IllegalArgumentException("Salary must be greater than 0.");
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setSalary(double newSalary) {
        salary = newSalary;
    }
    public String toString() {
        return "Name: " + name + " Salary: " + salary;
    }
}