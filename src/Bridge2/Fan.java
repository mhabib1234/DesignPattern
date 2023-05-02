package Bridge2;

public class Fan implements ElectricalEquipment {
    public void PowerOn()
    {
        System.out.println("Fan is On");
    }
    public void PowerOff()
    {
        System.out.println("Fan is off");
    }
}