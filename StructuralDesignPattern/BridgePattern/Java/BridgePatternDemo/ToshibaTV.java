package tw.hacker.java;

public class ToshibaTV implements ITV {
    @Override
    public void on() {
        System.out.println("Toshiba TV on!");
    }

    @Override
    public void off() {
        System.out.println("Toshiba TV off!");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Toshiba TV is on channel: " + channel);
    }
}
