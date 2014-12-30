package tw.hacker.java;

public class AppleRemoteControl extends AbstractRemoteControl
{
    public AppleRemoteControl(ITV tv)
    {
        super(tv);
    }

    public void setChannelPad(int channel)
    {
        setChannel(channel);
        System.out.println("Apple Remote Control Set Channel!");
    }
}