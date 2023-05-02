package Builder1;


public class Room {
    private double area;
    private int numWindows;
    private String type;

    public Room(double area, int numWindows, String type) {
        this.area = area;
        this.numWindows = numWindows;
        this.type = type;
    }

    // Getters and setters for the room's properties

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
