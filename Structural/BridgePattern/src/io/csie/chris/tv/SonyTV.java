package io.csie.chris.tv;

public class SonyTV implements ITV {

    @Override
    public void on() {
        System.out.println("Sony TV on!");
    }

    @Override
    public void off() {
        System.out.println("Sony TV off!");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony TV is on channel: " + channel);
    }
}
