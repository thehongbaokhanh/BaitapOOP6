    class battery {
    int energy;
    battery(int energy){
        this.energy = energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
    public void decreasedEnergy(){
        if (energy > 0 && energy <= 100){
            energy--;
        }
    }
}

    class flashLamp {
    boolean status;
    battery battery;

    flashLamp(boolean status, battery battery){
        this.status = status;
        this.battery = battery;
    }

    public int getBatteryInFor() {
        battery.decreasedEnergy();
        return battery.energy;
    }
    public void setBattery(battery battery) {
        this.battery = battery;
    }
    public void light() {
        battery.decreasedEnergy();
        if (status) {
            System.out.println("Light");
        }else {
            System.out.println("No light");
        }
    }
    public void turnOn(){
        status = true;
    }
    public void turnOff(){
        status = false;
    }

    public static void main(String[] args) {
        battery battery1 = new battery(50);
        battery battery2 = new battery(10);
        flashLamp flashLamp2 = new flashLamp(true, battery2);
        flashLamp2.getBatteryInFor();
        flashLamp2.setBattery(battery2);
//        flashLamp2.turnOff();
        flashLamp2.light();

    }
}
