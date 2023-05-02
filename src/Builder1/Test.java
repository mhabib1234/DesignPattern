package Builder1;

public class Test {
    public static void main(String[] args) {


        HouseBuilder builder = new HouseBuilder();

        HouseDirector director = new HouseDirector(builder);

        House smallHouse = director.buildSmallHouse();
        System.out.println("\nLarge House:\n" + smallHouse.getSummary() + "Cost is:"+smallHouse.calculateCost());

        House largeHouse = director.buildLargeHouse();
        System.out.println("\nLarge House:\n" + largeHouse.getSummary()+"Cost is:"+largeHouse.calculateCost() );




    }
}
