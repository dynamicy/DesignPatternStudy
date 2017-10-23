package io.csie.chris.remote;

import io.csie.chris.tv.ITV;

public class AppleRemoteControl extends AbstractRemoteControl {

    public AppleRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelPad(int channel) {

        setChannel(channel);
        System.out.println("Apple Remote Control Set Channel!");
    }
}