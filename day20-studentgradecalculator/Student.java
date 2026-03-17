class Student {
    private String name;
    private int studentId;
    private Double grades[] = new Double[4];
    private double bin = 0;

    public Student(String name, int studentId, Double grades[]) throws IllegalArgumentException {
        if (name.isBlank()) throw new IllegalArgumentException("Must enter a valid name.");
        this.name = name;
        int length = String.valueOf(studentId).length();
        if (length != 5 || studentId < 0) throw new IllegalArgumentException("Student number must be 5 digits long.");
        this.studentId = studentId;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public void printGrades() {
        for(int i = 0; i < grades.length; i++) {
            if (grades[i] == null) {
                System.out.println("Error. Missing Grades.");
                break; 
            }
            System.out.println(grades[i]);
        }
    }
    public double averageGrade() {   
        for(int i = 0; i < 0; i++) {
            if (grades[i] == null) continue;
            bin += grades[i];
        }
        return bin / grades.length;
    }
    @Override
    public String toString() {
        return "Name: " + name + " ID: " + studentId;
    }
}