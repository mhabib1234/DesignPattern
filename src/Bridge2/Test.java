package Bridge2;

class Test {
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

        }
    }