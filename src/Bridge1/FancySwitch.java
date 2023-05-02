package Bridge1;

public class FancySwitch extends Switch {
    private Fan fan;

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void IncreaseSpeed() {
        int currentSpeed = fan.getSpeed();
        fan.setSpeed(currentSpeed + 1);
    }

    public void DecreaseSpeed() {
        int currentSpeed = fan.getSpeed();
        fan.setSpeed(currentSpeed - 1);
    }
}