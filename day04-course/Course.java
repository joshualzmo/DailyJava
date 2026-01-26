public class Course {
    private String instructorName;
    private static String courseCode = "CS101";

    public Course(String instructorName) {
        this.instructorName = instructorName;
    }
    public String printInfo() {
        return Course.courseCode + " taught by: " + this.instructorName;
    }
    public static void updateCourseCode(String newCourseCode) {
        courseCode = newCourseCode;
    }
    public boolean equals(Course other) {
        if (this.instructorName.equals(other.instructorName)) {
            return true;
        } 
        else {
            return false;
        }
    }
}
