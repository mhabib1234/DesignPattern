package Builder1;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    protected int stories;
    protected String doorType;
    protected String roofType;
    String color;
    List<Room> rooms;

    public HouseBuilder setStories(int stories) {
        this.stories = stories;
        return this;
    }

    public HouseBuilder setDoorType(String doorType) {
        this.doorType = doorType;
        return this;
    }

    public HouseBuilder setRoofType(String roofType) {
        this.roofType = roofType;
        return this;
    }

    public HouseBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public HouseBuilder addRoom(Room room) {
        if (this.rooms == null) {
            this.rooms = new ArrayList<>();
        }
        this.rooms.add(room);
        return this;
    }

    public House build() {
        return new House(this);
    }
}
