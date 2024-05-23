package electriclamp;

public class MainElectricLamp {
    public static void main(String[] args) {
        SwitchButton button1 = new SwitchButton(true);
        ElectricLamp lamp = new ElectricLamp(false);
        button1.conectToLamp(lamp);
        button1.switchOn(lamp);
    }

}
