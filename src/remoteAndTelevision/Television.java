package remoteAndTelevision;

public class Television {
    boolean check, checkTurnOn;
    int sound, chanel, id;

    Television(int sound, int chanel, int id) {
        this.sound = sound;
        this.chanel = chanel;
        this.id = id;
    }

    public void setCheckTurnOn(Remote remote) {
        this.checkTurnOn = remote.checkTurnOn;
    }

    public void CheckRemote(Remote remote) {
        if (checkTurnOn) {
            if (remote.id != id) {
                check = false;
            } else {
                check = true;
            }
        }
    }

    public void setSound(Remote remote) {
        if (checkTurnOn) {
            this.sound = remote.sound;
        }
    }

    public void displayChannel() {
        if (checkTurnOn) {
            System.out.println("channel: " + chanel);
        }
    }

    public void displaySound() {
        if (checkTurnOn) {
            System.out.println("channel: " + sound);
        }
    }
}
