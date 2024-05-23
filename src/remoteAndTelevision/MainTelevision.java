package remoteAndTelevision;

public class MainTelevision {
    public static void main(String[] args) {
        Remote remote1 = new Remote(100);
        Television tvLd = new Television(50, 1,100);
        remote1.setCheckTurnOn(true);
        remote1.setChannel(7);
        tvLd.displayChannel();
    }
}
