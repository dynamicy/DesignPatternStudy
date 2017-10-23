package io.csie.chris;

import io.csie.chris.remote.AppleRemoteControl;
import io.csie.chris.tv.ITV;
import io.csie.chris.tv.SonyTV;

public class Main {

    public static void main(String args[]) {

        ITV myTV = new SonyTV();

        AppleRemoteControl myRemoteControl = new AppleRemoteControl(myTV);

        myRemoteControl.setChannelPad(200);
    }
}
