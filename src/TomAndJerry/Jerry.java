package TomAndJerry;

public class Jerry {
    String name, sound;
    int weight, speed;
    boolean check;
    Jerry(String name, String sound, int weight, int speed, boolean check){
        this.name = name;
        this.sound = sound;
        this.weight = weight;
        this.speed = speed;
        this.check = check;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void display(String sound){
        System.out.println(sound);
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
