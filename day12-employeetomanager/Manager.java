public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) throws IllegalArgumentException {
        super(name, salary);
        if (department.isBlank()) throw new IllegalArgumentException();
        this.department = department;
    }
    public String toString() {
        return "Name: " + getName() + " Salary: " + getSalary() + " Department: " + department;
    }


}
