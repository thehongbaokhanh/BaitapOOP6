package remoteAndTelevision;

public class Remote {
    int id, sound, channel;
    boolean checkTurnOn;
    Remote(int id){
        this.id = id;

    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void setChanel(Television television) {
        if (checkTurnOn) {
            this.channel = television.chanel;
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    public void increaseSound(Television tv) {
        if (tv.check)
            tv.sound++;
    }
    public void decreaseSound(Television tv) {
        if (tv.check)
            tv.sound--;
    }
    public void setSound(int sound) {
        this.sound = sound;
    }

    public void setCheckTurnOn(boolean checkTurnOn) {
        this.checkTurnOn = checkTurnOn;
    }
}
