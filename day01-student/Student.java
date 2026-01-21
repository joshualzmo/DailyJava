public class Student {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id, int grade) {
        String idCheck = String.valueOf(id);
        // Validate the ID by ensuring it is 7 digits 
        if (idCheck.length() != 7) {
            throw new IllegalArgumentException("ID must be exactly 7 digits.");
        }
        // Validate grade by making sure it is between 0 and 100
        String gradeCheck = String.valueOf(grade);
        if (gradeCheck.length() > 100 || gradeCheck.length() < 0) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getter Methods
    public String getName() {
        return name;
    }
    public int getID() {
        return id;
    }
    public int getGrade() {
        return grade;
    }

    // Setter Methods
    public void setName(String newName) {
        this.name = newName;
    }
    public void setID(int newID) {
        this.id = newID;
    }
    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }
    
    // toString method
    public String toString() {
        return "Name: " + this.name + " ID: " + this.id + " Grade: " + this.grade;
    }

    public static void main(String[] args) {
        Student s = new Student("Josh", 1234567, 99);
        // System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getID());
        System.out.println(s.getGrade());
    }


}