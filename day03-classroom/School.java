public class School {
    private final int LECTURE_SIZE = 3;
    private Scholar[] lectureHall;
    private int count = 0;

    public School() {
        lectureHall = new Scholar[LECTURE_SIZE];
    }
    public void addStudent(Scholar s) {
        if (s == null) {
            System.out.println("Object is null.");
            return;
        }
        else {
            if (count < LECTURE_SIZE) {
                lectureHall[count] = s;
                count++;
            }    
        }
    }
    public Scholar[] getLectureHall(){
        return lectureHall;
    }
    public double average(Scholar[] lecturehall) {
        double bin = 0;
        for(int i = 0; i < lecturehall.length; i++) {
            if (lecturehall[i] != null) {
                bin += lecturehall[i].getAverage();
            } 
        }
        if (count == 0) return 0;
        else {
            return bin / count;

    }
    }
    public double highestAverage(Scholar[] lecturehall) {
        double max = 0;
        for(int i = 0; i < lecturehall.length; i++) {
            if (lecturehall[i] != null) {
                if (lecturehall[i].getAverage() > max) {
                max = lecturehall[i].getAverage();
                }
            }
        }
        return max;
    }
}
