package Builder1;

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildSmallHouse() {
        Room livingRoom = new Room(100, 1, "living room");
        Room bedroom = new Room(50, 1, "bedroom");

        return builder.setStories(1)
                .setDoorType("single")
                .setRoofType("pointy")
                .setColor("white")
                .addRoom(livingRoom)
                .addRoom(bedroom)
                .build();
    }

    public House buildLargeHouse() {
        Room livingRoom1 = new Room(200, 2, "living room");
        Room bedroom1 = new Room(100, 2, "bedroom");
        Room bathroom1 = new Room(50, 1, "bathroom");

        return builder.setStories(2)
                .setDoorType("double")
                .setRoofType("flat")
                .setColor("blue")
                .addRoom(livingRoom1)
                .addRoom(bedroom1)
                .addRoom(bathroom1)
                .build();
    }

   /* public House build1StoryHouse() {
        return builder.setStories(1)
                .setDoorType("single")
                .setRoofType("pointy")
                .build();
    }

    public House build2StoryHouse() {
        return builder.setStories(2)
                .setDoorType("double")
                .setRoofType("flat")
                .build();
    }

    public House buildApartment() {
        return builder.setStories(10)
                .setDoorType("Steal")
                .setRoofType("Concrete")
                .build();
    }


    */
}
