package Bridge2;

public class Light implements ElectricalEquipment {
    public void PowerOn()
    {
        System.out.println("Light is On");
    }
    public void PowerOff()
    {
        System.out.println("Light is off");
    }
}