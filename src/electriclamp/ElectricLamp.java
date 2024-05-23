package electriclamp;

public class ElectricLamp {
    boolean status;
    ElectricLamp(boolean status){
        this.status = status;
    }
    public void turnOff(){
        status = false;
        System.out.println("turn off");
    }
    public void turnOn(){
        status = true;
        System.out.println("turn on");
    }

}
