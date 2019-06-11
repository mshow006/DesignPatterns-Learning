package headfirst._06command;

/**
 * @author yingming006
 * Date: 2019/6/11
 */
public class Stereo {

    private int volume;
    private boolean CD = false;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void setCD() {
        this.CD = true;
        System.out.println("CD is true");
    }

    public void setVolume(int i) {
        this.volume = i;
        System.out.println("volume is 11");
    }
}
