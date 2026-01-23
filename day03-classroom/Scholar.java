public class Scholar {
    private String name;
    private int id;
    private double average;

    public Scholar(String name, int id, double average) {
        String idCheck = String.valueOf(id);
        if (idCheck.length() != 7) throw new IllegalArgumentException("ID must be seven digits long.");
        this.name = name;
        this.id = id;
        this.average = average;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return id;
    }
    public double getAverage() {
        return average;
    }
}
