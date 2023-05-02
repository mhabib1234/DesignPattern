package Bridge1;

public class Switch {
    private ElectricalEquipment equipment;

    public void setElectricalEquipment(ElectricalEquipment equipment) {
        this.equipment = equipment;
    }

    public void On() {
        System.out.println("Switch on the equipment");
        equipment.PowerOn();
    }

    public void Off() {
        System.out.println("Switch Off the equipment");
        equipment.PowerOff();
    }
}

