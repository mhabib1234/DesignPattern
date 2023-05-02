package Bridge1;

public class Test {
    public static void main(String[] args) {
        // Create objects
        ElectricalEquipment fan = new Fan();
        ElectricalEquipment light = new Light();

        Switch fancySwitch = new FancySwitch();
        Switch normalSwitch = new NormalSwitch();

        fancySwitch.setElectricalEquipment(fan);
        fancySwitch.On();
        fancySwitch.Off();

        normalSwitch.setElectricalEquipment(light);
        normalSwitch.On();
        normalSwitch.Off();


        System.out.println("\n");
      // Turn the fan on
        Fan fan1 = new Fan();

        //creating object of fancySwitch and knowing the switch class that equipement would be a fan object
        FancySwitch fancySwitch1 = new FancySwitch();
        fancySwitch1.setElectricalEquipment(fan);
        fancySwitch1.setFan(fan1);

       // Increase the fan speed
        fancySwitch1.On();
        fancySwitch1.IncreaseSpeed();

      // Decrease the fan speed
        fancySwitch1.DecreaseSpeed();

       // Turn the fan off
        fancySwitch1.Off();
    }
}
