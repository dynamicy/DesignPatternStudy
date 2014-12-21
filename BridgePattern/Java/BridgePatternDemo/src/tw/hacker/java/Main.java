package tw.hacker.java;

public class Main
{
    public static void main(String args[])
    {
        ITV myTV = new SonyTV();
        AppleRemoteControl myRemoteControl = new AppleRemoteControl(myTV);

        myRemoteControl.setChannelPad(200);
    }
}
