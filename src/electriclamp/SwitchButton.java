package electriclamp;

public class SwitchButton {
    boolean status;
    ElectricLamp lamp;
    SwitchButton(boolean status){
        this.status = status;
    }
    public void conectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    public void switchOn(ElectricLamp lamp){
        status = true;
        lamp.turnOn();
    }
    public void switchOff(ElectricLamp lamp){
        status = false;
        lamp.turnOff();
    }
}
