package Builder1;

import java.util.List;

public class House {
    private int stories;
    private String doorType;
    private String roofType;
    private String color;
    private List<Room> rooms;
    public House(HouseBuilder builder) {
        this.stories = builder.stories;
        this.doorType = builder.doorType;
        this.roofType = builder.roofType;
        this.color = builder.color;
        this.rooms = builder.rooms;
    }
    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public double calculateCost() {
        double cost = 0;
        if (stories == 1) {
            cost += 50000;
        } else if (stories == 2) {
            cost += 75000;
        } else if (stories >= 3) {
            cost += 100000;
        }
        cost += rooms.size() * 10000;
        return cost;
    }

    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number of floor: ").append(stories).append("\n");
        sb.append("Roof type: ").append(roofType).append("\n");
        sb.append("Number of rooms: ").append(rooms.size()).append("\n");
        sb.append("Number of windows: ").append(countWindows()).append("\n");
        sb.append("Color: ").append(color).append("\n");
        return sb.toString();
    }

    private int countWindows() {
        int count = 0;
        for (Room room : rooms) {
            count += room.getNumWindows();
        }
        return count;
    }
}
