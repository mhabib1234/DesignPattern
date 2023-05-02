package Bridge1;

public class Fan implements ElectricalEquipment {
    private int speed = 1;

    public void PowerOn() {
        System.out.println("Fan is On");
    }
    public void PowerOff() {
        System.out.println("Fan is off");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Fan speed set to " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}