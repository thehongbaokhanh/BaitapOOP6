package TomAndJerry;

public class Tom {
    String name, sound;
    int weight, speed;

    Tom(String name, String sound, int weight, int speed){
        this.name = name;
        this.sound = sound;
        this.weight = weight;
        this.speed = speed;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void display(String sound){
        System.out.println(sound);
    }
    public void eatJerry(Jerry jerry){
        check(jerry);
        if (jerry.check){
        jerry.setCheck(false);
        }
    }
    public void check(Jerry jerry){
    }
    public void catchJerry(Jerry jerry){
        if (speed > jerry.speed){
           eatJerry(jerry);
           jerry.weight--;
        }
    }

}
