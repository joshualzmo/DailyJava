public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        this.name = name;
        if (age < 1) throw new IllegalArgumentException("Age must be greater than 0.");
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getDescription() {
        return "Student: " + name + " Age: " + age;
    }
}
